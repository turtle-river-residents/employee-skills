package employee_skills.api.persistence.database.postgresql.employee;

import java.util.ArrayList;
import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import employee_skills.api.persistence.database.postgresql.skill_with_genre.FindListSkillWithGenreMapper;
import employee_skills.backend.persistence.database.postgresql.table.DbEmployee;
import employee_skills.backend.persistence.database.postgresql.table.DbEmployeeExample;
import employee_skills.backend.persistence.database.postgresql.table.DbEmployeeMapper;
import employee_skills.core.domain.model.employee.Employee;
import employee_skills.core.domain.model.employee_skills.EmployeeSkills;
import employee_skills.core.dto.criteria.employee.EmployeeCriteria;
import employee_skills.core.gateway.employee.FindListEmployeeWithSkillsGateway;

@Repository
@RequiredArgsConstructor
public class FindListEmployeeWithSkillsRepository
        implements FindListEmployeeWithSkillsGateway {
    private final DbEmployeeMapper employeeMapper;
    private final FindListSkillWithGenreMapper findListSkillWithGenreMapper;

    @Override
    public List<EmployeeSkills> findBy(EmployeeCriteria criteria) {
        var ex = new DbEmployeeExample();
        ex.createCriteria();

        List<EmployeeSkills> employeeSkillsList = new ArrayList<>();
        List<DbEmployee> employeeList = employeeMapper.selectByExample(ex);
        employeeList.forEach(e ->
                employeeSkillsList.add(EmployeeSkills.builder()
                        .employee(Employee.builder()
                                .employeeNo(e.getEmployeeNo())
                                .lastName(e.getLastName())
                                .firstName(e.getFirstName())
                                .joinYear(e.getJoinYear())
                                .updateDatetime(e.getUpdateDatetime().toLocalDateTime())
                                .build()
                        )
                        .skillWithGenreList(
                                findListSkillWithGenreMapper.findBy(e.getEmployeeNo()))
                        .build()
                )
        );

        return employeeSkillsList;
    }
}
