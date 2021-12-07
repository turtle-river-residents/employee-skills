package employee_skills.api.domain.interactor.employee;

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

import employee_skills.core.domain.model.employee.Employee;
import employee_skills.core.domain.model.employee_skills.EmployeeSkills;
import employee_skills.core.domain.model.operation.EsOperation;
import employee_skills.core.domain.model.skill.SkillWithGenre;
import employee_skills.core.dto.source.employee.RegisterEmployeeInput;
import employee_skills.core.gateway.operation.EsOperationGateway;

@ExtendWith(MockitoExtension.class)
class RegisterEmployeeInteractorTest {

    @Test
    void handle() {
        var source = RegisterEmployeeInput.builder()
                .employeeNo("employeeNo")
                .lastName("lastName")
                .firstName("firstName")
                .joinYear(Year.of(2021))
                .skillWithGenreList(List.of(
                        SkillWithGenre.builder().skillId("s1").build(),
                        SkillWithGenre.builder().skillId("s2").build()
                ))
                .build();
        var actual = target.handle(source);
        var expected = EmployeeSkills.builder()
                .employee(Employee.builder()
                        .employeeNo("employeeNo")
                        .lastName("lastName")
                        .firstName("firstName")
                        .joinYear(Year.of(2021))
                        .build())
                .skillWithGenreList(List.of(
                        SkillWithGenre.builder().skillId("s1").build(),
                        SkillWithGenre.builder().skillId("s2").build()
                ))
                .operation(OPERATION)
                .build();

        assertThat(actual, is(expected));
    }

    @BeforeEach
    void setUp() {
        when(operationGateway.load())
                .thenReturn(OPERATION);
    }

    @InjectMocks
    private RegisterEmployeeInteractor target;
    @Mock(lenient = true)
    private EsOperationGateway operationGateway;

    private final static EsOperation OPERATION = EsOperation.builder()
            .userId("userId")
            .dateTime(LocalDateTime.of(2021, 10, 1, 0, 0, 0, 123456789))
            .build();
}