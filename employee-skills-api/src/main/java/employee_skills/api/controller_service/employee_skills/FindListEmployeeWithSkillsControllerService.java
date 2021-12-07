package employee_skills.api.controller_service.employee_skills;

import employee_skills.api.controller_service.ListDefaultControllerService;
import employee_skills.api.dto.employee.ApiEmployeeCriteria;
import employee_skills.api.dto.employee_skills.ApiEmployeeWithSkillsResult;

public interface FindListEmployeeWithSkillsControllerService
        extends ListDefaultControllerService<ApiEmployeeCriteria, ApiEmployeeWithSkillsResult> {
}
