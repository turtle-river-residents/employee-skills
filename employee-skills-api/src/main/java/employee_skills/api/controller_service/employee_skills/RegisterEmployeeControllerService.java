package employee_skills.api.controller_service.employee_skills;

import employee_skills.api.controller_service.DefaultControllerService;
import employee_skills.api.dto.employee_skills.ApiRegisterEmployeeSource;
import employee_skills.core.domain.model.employee_skills.EmployeeSkills;

public interface RegisterEmployeeControllerService
        extends DefaultControllerService<ApiRegisterEmployeeSource, EmployeeSkills> {
}
