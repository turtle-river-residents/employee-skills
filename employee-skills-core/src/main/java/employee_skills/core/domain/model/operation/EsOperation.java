package employee_skills.core.domain.model.operation;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class EsOperation {
    private String userId;
    private LocalDateTime dateTime;
}
