package employee_skills.api.convert.employee_with_skills;

import java.time.LocalDateTime;
import java.time.Year;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import employee_skills.api.dto.employee_skills.ApiEmployeeWithSkillsResult;
import employee_skills.core.domain.model.employee.Employee;
import employee_skills.core.domain.model.employee_skills.EmployeeSkills;
import employee_skills.core.domain.model.skill.SkillWithGenre;

@ExtendWith(MockitoExtension.class)
class FindListEmployeeWithSkillsPresenterImplTest {

    @Test
    void convert() {
        var source = List.of(
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

        var actual = target.convert(source);

        var expected = List.of(
                ApiEmployeeWithSkillsResult.builder()
                        .employeeNo("ABC00001")
                        .name("last1 first1")
                        .joinYear(2016)
                        .skillNameList("skill1\n")
                        .build(),
                ApiEmployeeWithSkillsResult.builder()
                        .employeeNo("ABC00002")
                        .name("last2 first2")
                        .joinYear(2017)
                        .skillNameList("skill1\nskill2\n")
                        .build()

        );

        assertThat(actual, is(expected));
    }

    @InjectMocks
    private FindListEmployeeWithSkillsPresenterImpl target;
}