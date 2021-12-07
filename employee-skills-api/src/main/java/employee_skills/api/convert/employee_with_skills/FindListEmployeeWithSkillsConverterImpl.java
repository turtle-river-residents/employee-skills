package employee_skills.api.convert.employee_with_skills;

import org.springframework.stereotype.Component;

import employee_skills.api.dto.employee.ApiEmployeeCriteria;
import employee_skills.core.dto.criteria.employee.EmployeeCriteria;

@Component
public class FindListEmployeeWithSkillsConverterImpl
        implements FindListEmployeeWithSkillsConverter {

    @Override
    public EmployeeCriteria convert(ApiEmployeeCriteria source) {
        return EmployeeCriteria.builder().build();
    }
}
