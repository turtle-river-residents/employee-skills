package employee_skills.api.controller_service.employee_skills;

import java.time.LocalDateTime;
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

import employee_skills.api.convert.employee.RegisterEmployeeConverter;
import employee_skills.api.domain.usecase.employee.RegisterEmployeeUseCase;
import employee_skills.api.dto.employee_skills.ApiRegisterEmployeeSource;
import employee_skills.core.domain.model.employee.Employee;
import employee_skills.core.domain.model.employee_skills.EmployeeSkills;
import employee_skills.core.domain.model.operation.EsOperation;
import employee_skills.core.domain.model.skill.SkillWithGenre;
import employee_skills.core.dto.source.employee.RegisterEmployeeInput;

@ExtendWith(MockitoExtension.class)
class RegisterEmployeeControllerServiceImplTest {

    @BeforeEach
    void setUp() {
        when(converter.convert(ApiRegisterEmployeeSource.builder()
                .employeeNo("employeeNo")
                .lastName("lastName")
                .firstName("firstName")
                .skillList(List.of("s1", "s2"))
                .build()))
                .thenReturn(RegisterEmployeeInput.builder()
                        .build());
        when(useCase.handle(RegisterEmployeeInput.builder()
                .build()))
                .thenReturn(EmployeeSkills.builder()
                        .employee(Employee.builder()
                                .employeeNo("employeeNo")
                                .lastName("lastName")
                                .firstName("firstName")
                                .build())
                        .skillWithGenreList(List.of(
                                SkillWithGenre.builder().skillId("s1").build(),
                                SkillWithGenre.builder().skillId("s2").build()
                        ))
                        .operation(EsOperation.builder()
                                .userId("userId")
                                .dateTime(LocalDateTime.of(2021, 10, 1, 0, 0, 0, 123456789))
                                .build())
                        .build());
    }

    @Test
    void handle() {
        var source = ApiRegisterEmployeeSource.builder()
                .employeeNo("employeeNo")
                .lastName("lastName")
                .firstName("firstName")
                .skillList(List.of("s1", "s2"))
                .build();
        var actual = target.handle(source);
        var expected = EmployeeSkills.builder()
                .employee(Employee.builder()
                        .employeeNo("employeeNo")
                        .lastName("lastName")
                        .firstName("firstName")
                        .build())
                .skillWithGenreList(List.of(
                        SkillWithGenre.builder().skillId("s1").build(),
                        SkillWithGenre.builder().skillId("s2").build()
                ))
                .operation(EsOperation.builder()
                        .userId("userId")
                        .dateTime(LocalDateTime.of(2021, 10, 1, 0, 0, 0, 123456789))
                        .build())
                .build();

        assertThat(actual, is(expected));
    }

    @InjectMocks
    private RegisterEmployeeControllerServiceImpl target;
    @Mock(lenient = true)
    private RegisterEmployeeConverter converter;
    @Mock(lenient = true)
    private RegisterEmployeeUseCase useCase;
}