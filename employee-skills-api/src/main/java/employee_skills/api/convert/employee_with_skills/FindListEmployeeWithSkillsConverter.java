package employee_skills.api.convert.employee_with_skills;

import employee_skills.api.convert.DefaultConvert;
import employee_skills.api.dto.employee.ApiEmployeeCriteria;
import employee_skills.core.dto.criteria.employee.EmployeeCriteria;

public interface FindListEmployeeWithSkillsConverter
        extends DefaultConvert<ApiEmployeeCriteria, EmployeeCriteria> {
}
