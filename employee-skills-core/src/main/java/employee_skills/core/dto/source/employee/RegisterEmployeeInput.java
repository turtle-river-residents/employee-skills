package employee_skills.core.dto.source.employee;

import java.time.Year;
import java.util.List;

import lombok.Builder;
import lombok.Value;

import employee_skills.core.domain.model.skill.SkillWithGenre;

@Builder
@Value
public class RegisterEmployeeInput {
    private String employeeNo;
    private String lastName;
    private String firstName;
    private Year joinYear;
    private List<SkillWithGenre> skillWithGenreList;
}
