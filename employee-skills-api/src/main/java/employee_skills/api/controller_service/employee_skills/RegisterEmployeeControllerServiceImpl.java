package employee_skills.api.controller_service.employee_skills;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import employee_skills.api.convert.employee.RegisterEmployeeConverter;
import employee_skills.api.domain.usecase.employee.RegisterEmployeeUseCase;
import employee_skills.api.dto.employee_skills.ApiRegisterEmployeeSource;
import employee_skills.core.domain.model.employee_skills.EmployeeSkills;

@Component
@RequiredArgsConstructor
public class RegisterEmployeeControllerServiceImpl
        implements RegisterEmployeeControllerService {
    private final RegisterEmployeeConverter converter;
    private final RegisterEmployeeUseCase useCase;

    @Override
    public EmployeeSkills handle(ApiRegisterEmployeeSource source) {
        var input = converter.convert(source);
        return useCase.handle(input);
    }
}
