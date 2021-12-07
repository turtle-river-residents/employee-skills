package employee_skills.api.convert.employee;

import java.time.Year;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import employee_skills.api.dto.employee_skills.ApiRegisterEmployeeSource;
import employee_skills.core.domain.model.skill.SkillWithGenre;
import employee_skills.core.dto.source.employee.RegisterEmployeeInput;

@ExtendWith(MockitoExtension.class)
class RegisterEmployeeConverterImplTest {

    @Test
    void convert() {
        var source = ApiRegisterEmployeeSource.builder()
                .employeeNo("employeeNo")
                .lastName("lastName")
                .firstName("firstName")
                .joinYear("2021")
                .skillList(List.of("s1", "s2"))
                .build();

        var actual = target.convert(source);

        var expected = RegisterEmployeeInput.builder()
                .employeeNo("employeeNo")
                .lastName("lastName")
                .firstName("firstName")
                .joinYear(Year.of(2021))
                .skillWithGenreList(List.of(
                        SkillWithGenre.builder().skillId("s1").build(),
                        SkillWithGenre.builder().skillId("s2").build()
                ))
                .build();

        assertThat(actual, is(expected));
    }

    @InjectMocks
    private RegisterEmployeeConverterImpl target;
}