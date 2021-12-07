package employee_skills.core.domain.model.employee;

import java.time.LocalDateTime;
import java.time.Year;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class Employee {
    private String employeeNo;
    private String lastName;
    private String firstName;
    private Year joinYear;
    private LocalDateTime updateDatetime;
}
