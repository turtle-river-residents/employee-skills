package employee_skills.api.domain.usecase.employee;

import employee_skills.core.domain.model.employee_skills.EmployeeSkills;
import employee_skills.core.domain.usecase.FindListDefaultUseCase;
import employee_skills.core.dto.criteria.employee.EmployeeCriteria;

public interface FindEmployeeWithSkillsUseCase
        extends FindListDefaultUseCase<EmployeeCriteria, EmployeeSkills> {
}
