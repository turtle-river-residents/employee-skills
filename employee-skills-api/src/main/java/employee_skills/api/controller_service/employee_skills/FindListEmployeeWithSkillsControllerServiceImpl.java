package employee_skills.api.controller_service.employee_skills;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import employee_skills.api.convert.employee_with_skills.FindListEmployeeWithSkillsConverter;
import employee_skills.api.convert.employee_with_skills.FindListEmployeeWithSkillsPresenter;
import employee_skills.api.domain.usecase.employee.FindEmployeeWithSkillsUseCase;
import employee_skills.api.dto.employee.ApiEmployeeCriteria;
import employee_skills.api.dto.employee_skills.ApiEmployeeWithSkillsResult;

@Component
@RequiredArgsConstructor
public class FindListEmployeeWithSkillsControllerServiceImpl
        implements FindListEmployeeWithSkillsControllerService {
    private final FindListEmployeeWithSkillsConverter converter;
    private final FindEmployeeWithSkillsUseCase useCase;
    private final FindListEmployeeWithSkillsPresenter presenter;

    @Override
    public List<ApiEmployeeWithSkillsResult> handle(ApiEmployeeCriteria source) {
        var criteria = converter.convert(source);
        var output = useCase.handle(criteria);

        return presenter.convert(output);
    }
}
