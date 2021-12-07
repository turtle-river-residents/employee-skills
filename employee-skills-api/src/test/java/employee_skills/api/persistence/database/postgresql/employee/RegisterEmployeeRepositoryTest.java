package employee_skills.api.persistence.database.postgresql.employee;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.Year;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;

import employee_skills.backend.persistence.database.postgresql.table.DbEmployee;
import employee_skills.backend.persistence.database.postgresql.table.DbEmployeeMapper;
import employee_skills.core.domain.model.employee.Employee;
import employee_skills.core.domain.model.employee_skills.EmployeeSkills;
import employee_skills.core.domain.model.operation.EsOperation;
import employee_skills.core.domain.model.skill.SkillWithGenre;

@ExtendWith(MockitoExtension.class)
class RegisterEmployeeRepositoryTest {

    @BeforeEach
    void setUp() {
        when(mapper.insertSelective(DB_EMPLOYEE))
                .thenReturn(1);
    }

    @Test
    void convert() {
        var actual = target.convert(EMPLOYEE_SKILLS);
        assertThat(actual, is(DB_EMPLOYEE));
    }

    @Test
    void save() {
        var actual = target.save(DB_EMPLOYEE);
        assertThat(actual, is(1));
    }

    @InjectMocks
    private RegisterEmployeeRepository target;
    @Mock(lenient = true)
    private DbEmployeeMapper mapper;

    private static final EmployeeSkills EMPLOYEE_SKILLS = EmployeeSkills.builder()
            .employee(Employee.builder()
                    .employeeNo(null)
                    .lastName("lastName")
                    .firstName("firstName")
                    .joinYear(Year.of(2020))
                    .build())
            .skillWithGenreList(List.of(
                            SkillWithGenre.builder()
                                    .skillId("s1")
                                    .skillName("sn1")
                                    .genreId("g1")
                                    .genreName("gn1")
                                    .build(),
                            SkillWithGenre.builder()
                                    .skillId("s2")
                                    .skillName("sn2")
                                    .genreId("g2")
                                    .genreName("gn2")
                                    .build()
                    )
            )
            .operation(EsOperation.builder()
                    .userId("userId")
                    .dateTime(LocalDateTime.of(2021, 10, 1, 0, 0, 0, 123456789))
                    .build())
            .build();

    private static final DbEmployee DB_EMPLOYEE = DbEmployee.builder()
            .employeeNo(null)
            .lastName("lastName")
            .firstName("firstName")
            .joinYear(Year.of(2020))
            .insertDatetime(Timestamp.valueOf(LocalDateTime.of(2021, 10, 1, 0, 0, 0, 123456789)))
            .updateDatetime(Timestamp.valueOf(LocalDateTime.of(2021, 10, 1, 0, 0, 0, 123456789)))
            .insertUserId("userId")
            .updateUserId("userId")
            .build();
}