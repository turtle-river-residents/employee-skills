package employee_skills.api.domain.interactor.employee;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import employee_skills.api.domain.usecase.employee.RegisterEmployeeUseCase;
import employee_skills.core.domain.model.employee.Employee;
import employee_skills.core.domain.model.employee_skills.EmployeeSkills;
import employee_skills.core.domain.model.operation.EsOperation;
import employee_skills.core.dto.source.employee.RegisterEmployeeInput;
import employee_skills.core.gateway.operation.EsOperationGateway;

@Component
@RequiredArgsConstructor
public class RegisterEmployeeInteractor implements RegisterEmployeeUseCase {
    private final EsOperationGateway operationGateway;

    @Override
    public EmployeeSkills handle(RegisterEmployeeInput source) {
        EsOperation operation = operationGateway.load();

        return EmployeeSkills.builder()
                .employee(Employee.builder()
                        .employeeNo(source.getEmployeeNo())
                        .lastName(source.getLastName())
                        .firstName(source.getFirstName())
                        .joinYear(source.getJoinYear())
                        .build())
                .skillWithGenreList(source.getSkillWithGenreList())
                .operation(operation)
                .build();
    }
}
