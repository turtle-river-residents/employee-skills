package employee_skills.api.persistence.database.postgresql.employee_skills;

import java.util.List;

import org.springframework.stereotype.Repository;

import employee_skills.api.persistence.database.SaveListDefaultRepository;
import employee_skills.api.persistence.database.postgresql.employee.RegisterEmployeeRepository;
import employee_skills.core.domain.model.employee_skills.EmployeeSkills;

@Repository
public class SaveListEmployeeWithSkillsRepository
        extends SaveListDefaultRepository<EmployeeSkills> {

    public SaveListEmployeeWithSkillsRepository(
            RegisterEmployeeRepository registerEmployeeRepository
    ) {
        super(List.of(registerEmployeeRepository));
    }
}
