package employee_skills.api.convert.employee;

import employee_skills.api.convert.DefaultConvert;
import employee_skills.api.dto.employee_skills.ApiRegisterEmployeeSource;
import employee_skills.core.dto.source.employee.RegisterEmployeeInput;

public interface RegisterEmployeeConverter
        extends DefaultConvert<ApiRegisterEmployeeSource, RegisterEmployeeInput> {
}
