package employee_skills.api.convert.employee;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import employee_skills.api.dto.employee_skills.ApiRegisterEmployeeSource;
import employee_skills.core.domain.model.skill.SkillWithGenre;
import employee_skills.core.dto.source.employee.RegisterEmployeeInput;

@Component
public class RegisterEmployeeConverterImpl implements RegisterEmployeeConverter {

    @Override
    public RegisterEmployeeInput convert(ApiRegisterEmployeeSource source) {
        return RegisterEmployeeInput.builder()
                .employeeNo(source.getEmployeeNo())
                .lastName(source.getLastName())
                .firstName(source.getFirstName())
                .joinYear(Year.parse(source.getJoinYear()))
                .skillWithGenreList(toSkillWithGenre(source.getSkillList()))
                .build();
    }

    private List<SkillWithGenre> toSkillWithGenre(List<String> skillList) {
        var retList = new ArrayList<SkillWithGenre>();
        skillList.forEach(e -> retList.add(
                SkillWithGenre.builder()
                        .skillId(e)
                        .build()
        ));
        return retList;
    }
}
