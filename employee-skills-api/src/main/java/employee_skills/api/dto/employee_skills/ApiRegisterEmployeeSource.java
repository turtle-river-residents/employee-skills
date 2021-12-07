package employee_skills.api.dto.employee_skills;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiRegisterEmployeeSource {
    private String employeeNo;
    private String lastName;
    private String firstName;
    private String joinYear;
    private List<String> skillList;
}
