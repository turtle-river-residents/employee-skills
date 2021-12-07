package employee_skills.api.dto.employee_skills;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class ApiEmployeeWithSkillsResult {
    private String employeeNo;
    private String name;
    private int joinYear;
    private String skillNameList;
}
