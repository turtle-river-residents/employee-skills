package employee_skills.api.domain.usecase.employee;

import employee_skills.core.domain.model.employee_skills.EmployeeSkills;
import employee_skills.core.domain.usecase.RegisterDefaultUseCase;
import employee_skills.core.dto.source.employee.RegisterEmployeeInput;

public interface RegisterEmployeeUseCase
        extends RegisterDefaultUseCase<RegisterEmployeeInput, EmployeeSkills> {
}
