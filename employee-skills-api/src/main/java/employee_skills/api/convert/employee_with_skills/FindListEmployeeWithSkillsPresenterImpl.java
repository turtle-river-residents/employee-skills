package employee_skills.api.convert.employee_with_skills;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import employee_skills.api.dto.employee_skills.ApiEmployeeWithSkillsResult;
import employee_skills.core.domain.model.employee_skills.EmployeeSkills;
import employee_skills.core.domain.model.skill.SkillWithGenre;

@Component
public class FindListEmployeeWithSkillsPresenterImpl
        implements FindListEmployeeWithSkillsPresenter {

    @Override
    public List<ApiEmployeeWithSkillsResult> convert(List<EmployeeSkills> source) {
        List<ApiEmployeeWithSkillsResult> resultList = new ArrayList<>();
        source.forEach(e ->
                resultList.add(ApiEmployeeWithSkillsResult.builder()
                        .employeeNo(e.getEmployee().getEmployeeNo())
                        .name(e.getEmployee().getLastName().concat(" ").concat(e.getEmployee().getFirstName()))
                        .joinYear(e.getEmployee().getJoinYear().getValue())
                        .skillNameList(toSkillNameList(e.getSkillWithGenreList()))
                        .build())
        );

        return resultList;
    }

    private String toSkillNameList(List<SkillWithGenre> srcList) {
        final String[] skillName = {""};
        srcList.forEach(e ->
                skillName[0] += e.getSkillName().concat("\n")
        );
        return skillName[0];
    }
}
