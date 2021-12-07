package employee_skills.api.persistence.database.postgresql.employee;

import java.sql.Timestamp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import employee_skills.api.persistence.database.SaveDefaultRepository;
import employee_skills.backend.persistence.database.postgresql.table.DbEmployee;
import employee_skills.backend.persistence.database.postgresql.table.DbEmployeeMapper;
import employee_skills.core.domain.model.employee_skills.EmployeeSkills;

@Repository
@RequiredArgsConstructor
public class RegisterEmployeeRepository
        implements SaveDefaultRepository<EmployeeSkills, DbEmployee> {
    private final DbEmployeeMapper employeeMapper;

    @Override
    public DbEmployee convert(EmployeeSkills target) {
        return DbEmployee.builder()
                .employeeNo(target.getEmployee().getEmployeeNo())
                .lastName(target.getEmployee().getLastName())
                .firstName(target.getEmployee().getFirstName())
                .joinYear(target.getEmployee().getJoinYear())
                .insertDatetime(Timestamp.valueOf(target.getOperation().getDateTime()))
                .updateDatetime(Timestamp.valueOf(target.getOperation().getDateTime()))
                .insertUserId(target.getOperation().getUserId())
                .updateUserId(target.getOperation().getUserId())
                .build();
    }

    @Override
    public int save(DbEmployee entity) {
        return employeeMapper.insertSelective(entity);
    }
}
