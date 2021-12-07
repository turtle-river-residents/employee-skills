package employee_skills.api.provider.operation;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import employee_skills.core.domain.model.operation.EsOperation;
import employee_skills.core.gateway.operation.EsOperationGateway;

@Component
public class EsOperationProvider implements EsOperationGateway {

    @Override
    public EsOperation load() {
        return EsOperation.builder()
                .userId("TEST_USER")
                .dateTime(LocalDateTime.now())
                .build();
    }
}
