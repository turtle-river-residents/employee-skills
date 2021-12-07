package employee_skills.api.controller.employee_skills;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import employee_skills.api.controller_service.employee_skills.FindListEmployeeWithSkillsControllerService;
import employee_skills.api.dto.employee.ApiEmployeeCriteria;
import employee_skills.api.dto.employee_skills.ApiEmployeeWithSkillsResult;

@RestController
@RequestMapping(value = "/api/employeeSkills/find")
@RequiredArgsConstructor
public class FindEmployeeSkillsController {
    private final FindListEmployeeWithSkillsControllerService service;

    @PostMapping
    List<ApiEmployeeWithSkillsResult> handle(@RequestBody ApiEmployeeCriteria criteria) {
        return service.handle(criteria);
    }
}
