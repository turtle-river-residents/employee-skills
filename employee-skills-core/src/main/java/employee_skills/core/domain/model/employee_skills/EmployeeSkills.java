package employee_skills.core.domain.model.employee_skills;

import java.util.List;

import lombok.Builder;
import lombok.Value;

import employee_skills.core.domain.model.employee.Employee;
import employee_skills.core.domain.model.operation.EsOperation;
import employee_skills.core.domain.model.skill.SkillWithGenre;

@Builder
@Value
public class EmployeeSkills {
    private Employee employee;
    private List<SkillWithGenre> skillWithGenreList;
    private EsOperation operation;
}
