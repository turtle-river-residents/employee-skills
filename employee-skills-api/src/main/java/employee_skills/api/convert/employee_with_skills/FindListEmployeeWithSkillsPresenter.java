package employee_skills.api.convert.employee_with_skills;

import employee_skills.api.convert.ListDefaultConvert;
import employee_skills.api.dto.employee_skills.ApiEmployeeWithSkillsResult;
import employee_skills.core.domain.model.employee_skills.EmployeeSkills;

public interface FindListEmployeeWithSkillsPresenter
        extends ListDefaultConvert<EmployeeSkills, ApiEmployeeWithSkillsResult> {
}
