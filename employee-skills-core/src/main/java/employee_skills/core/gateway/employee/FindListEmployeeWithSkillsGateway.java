package employee_skills.core.gateway.employee;

import employee_skills.core.domain.model.employee_skills.EmployeeSkills;
import employee_skills.core.dto.criteria.employee.EmployeeCriteria;
import employee_skills.core.gateway.FindListDefaultGateway;

public interface FindListEmployeeWithSkillsGateway
        extends FindListDefaultGateway<EmployeeCriteria, EmployeeSkills> {
}
