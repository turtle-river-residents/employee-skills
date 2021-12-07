package employee_skills.api.dto.item.ApiItem;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class ApiItem {
    private String label;
    private String value;
}
