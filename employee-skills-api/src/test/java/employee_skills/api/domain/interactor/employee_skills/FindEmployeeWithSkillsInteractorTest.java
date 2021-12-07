package employee_skills.api.domain.interactor.employee_skills;

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
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import employee_skills.core.domain.model.employee.Employee;
import employee_skills.core.domain.model.employee_skills.EmployeeSkills;
import employee_skills.core.domain.model.skill.SkillWithGenre;
import employee_skills.core.dto.criteria.employee.EmployeeCriteria;
import employee_skills.core.gateway.employee.FindListEmployeeWithSkillsGateway;

@ExtendWith(MockitoExtension.class)
class FindEmployeeWithSkillsInteractorTest {

    @BeforeEach
    void setUp() {
        when(findListEmployeeWithSkillsGateway.findBy(any()))
                .thenReturn(List.of(
                                EmployeeSkills.builder()
                                        .employee(Employee.builder()
                                                .employeeNo("ABC00001")
                                                .lastName("last1")
                                                .firstName("first1")
                                                .joinYear(Year.of(2016))
                                                .updateDatetime(LocalDateTime.of(2021, 10, 1, 0, 0, 0))
                                                .build())
                                        .skillWithGenreList(List.of(
                                                        SkillWithGenre.builder()
                                                                .genreId("genreId1")
                                                                .genreName("genre1")
                                                                .skillId("skillId1")
                                                                .skillName("skill1")
                                                                .build()
                                                )
                                        )
                                        .build(),
                                EmployeeSkills.builder()
                                        .employee(Employee.builder()
                                                .employeeNo("ABC00002")
                                                .lastName("last2")
                                                .firstName("first2")
                                                .joinYear(Year.of(2017))
                                                .updateDatetime(LocalDateTime.of(2021, 10, 1, 0, 0, 0))
                                                .build())
                                        .skillWithGenreList(List.of(
                                                        SkillWithGenre.builder()
                                                                .genreId("genreId1")
                                                                .genreName("genre1")
                                                                .skillId("skillId1")
                                                                .skillName("skill1")
                                                                .build(),
                                                        SkillWithGenre.builder()
                                                                .genreId("genreId2")
                                                                .genreName("genre2")
                                                                .skillId("skillId2")
                                                                .skillName("skill2")
                                                                .build()
                                                )
                                        )
                                        .build()
                        )
                );
    }

    @Test
    void handle() {
        var criteria = EmployeeCriteria.builder().build();
        var actual = target.handle(criteria);
        var expected = List.of(
                EmployeeSkills.builder()
                        .employee(Employee.builder()
                                .employeeNo("ABC00001")
                                .lastName("last1")
                                .firstName("first1")
                                .joinYear(Year.of(2016))
                                .updateDatetime(LocalDateTime.of(2021, 10, 1, 0, 0, 0))
                                .build())
                        .skillWithGenreList(List.of(
                                        SkillWithGenre.builder()
                                                .genreId("genreId1")
                                                .genreName("genre1")
                                                .skillId("skillId1")
                                                .skillName("skill1")
                                                .build()
                                )
                        )
                        .build(),
                EmployeeSkills.builder()
                        .employee(Employee.builder()
                                .employeeNo("ABC00002")
                                .lastName("last2")
                                .firstName("first2")
                                .joinYear(Year.of(2017))
                                .updateDatetime(LocalDateTime.of(2021, 10, 1, 0, 0, 0))
                                .build())
                        .skillWithGenreList(List.of(
                                        SkillWithGenre.builder()
                                                .genreId("genreId1")
                                                .genreName("genre1")
                                                .skillId("skillId1")
                                                .skillName("skill1")
                                                .build(),
                                        SkillWithGenre.builder()
                                                .genreId("genreId2")
                                                .genreName("genre2")
                                                .skillId("skillId2")
                                                .skillName("skill2")
                                                .build()
                                )
                        )
                        .build()
        );

        assertThat(actual, is(expected));
    }

    @InjectMocks
    private FindEmployeeWithSkillsInteractor target;
    @Mock(lenient = true)
    private FindListEmployeeWithSkillsGateway findListEmployeeWithSkillsGateway;
}