package employee_skills.api.domain.interactor.employee_skills;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import employee_skills.api.domain.usecase.employee.FindEmployeeWithSkillsUseCase;
import employee_skills.core.domain.model.employee_skills.EmployeeSkills;
import employee_skills.core.dto.criteria.employee.EmployeeCriteria;
import employee_skills.core.gateway.employee.FindListEmployeeWithSkillsGateway;

@Component
@RequiredArgsConstructor
public class FindEmployeeWithSkillsInteractor implements FindEmployeeWithSkillsUseCase {
    private final FindListEmployeeWithSkillsGateway findListEmployeeWithSkillsGateway;

    @Override
    public List<EmployeeSkills> handle(EmployeeCriteria criteria) {
        return findListEmployeeWithSkillsGateway.findBy(criteria);
    }
}
