package employee_skills.api.controller_service.employee_skills;

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

import employee_skills.api.convert.employee_with_skills.FindListEmployeeWithSkillsConverter;
import employee_skills.api.convert.employee_with_skills.FindListEmployeeWithSkillsPresenter;
import employee_skills.api.domain.usecase.employee.FindEmployeeWithSkillsUseCase;
import employee_skills.api.dto.employee.ApiEmployeeCriteria;
import employee_skills.api.dto.employee_skills.ApiEmployeeWithSkillsResult;
import employee_skills.core.dto.criteria.employee.EmployeeCriteria;

@ExtendWith(MockitoExtension.class)
class FindListEmployeeWithSkillsControllerServiceImplTest {

    @BeforeEach
    void setUp() {
        when(converter.convert(ApiEmployeeCriteria.builder().build()))
                .thenReturn(EmployeeCriteria.builder().build());
        when(useCase.handle(EmployeeCriteria.builder().build()))
                .thenReturn(List.of());
        when(presenter.convert(List.of()))
                .thenReturn(List.of(
                        ApiEmployeeWithSkillsResult.builder()
                                .employeeNo("1")
                                .name("na me1")
                                .joinYear(2016)
                                .skillNameList("skill1")
                                .build(),
                        ApiEmployeeWithSkillsResult.builder()
                                .employeeNo("2")
                                .name("na me2")
                                .joinYear(2016)
                                .skillNameList("skill2 skill3")
                                .build()
                ));
    }

    @Test
    void handle() {
        var source = ApiEmployeeCriteria.builder().build();
        var actual = target.handle(source);
        var expected = List.of(
                ApiEmployeeWithSkillsResult.builder()
                        .employeeNo("1")
                        .name("na me1")
                        .joinYear(2016)
                        .skillNameList("skill1")
                        .build(),
                ApiEmployeeWithSkillsResult.builder()
                        .employeeNo("2")
                        .name("na me2")
                        .joinYear(2016)
                        .skillNameList("skill2 skill3")
                        .build()
        );

        assertThat(actual, is(expected));
    }

    @InjectMocks
    private FindListEmployeeWithSkillsControllerServiceImpl target;
    @Mock(lenient = true)
    private FindListEmployeeWithSkillsConverter converter;
    @Mock(lenient = true)
    private FindEmployeeWithSkillsUseCase useCase;
    @Mock(lenient = true)
    private FindListEmployeeWithSkillsPresenter presenter;
}