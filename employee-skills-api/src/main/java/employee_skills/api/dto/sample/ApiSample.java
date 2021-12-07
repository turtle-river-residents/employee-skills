package employee_skills.api.dto.sample;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiSample {
    private int id;
    private String name;
    private String datetime;
}
