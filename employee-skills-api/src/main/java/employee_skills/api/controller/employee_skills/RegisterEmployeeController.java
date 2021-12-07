package employee_skills.api.controller.employee_skills;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import employee_skills.api.controller_service.employee_skills.RegisterEmployeeControllerService;
import employee_skills.api.dto.employee_skills.ApiRegisterEmployeeSource;
import employee_skills.api.persistence.database.postgresql.employee_skills.SaveListEmployeeWithSkillsRepository;

@RestController
@RequestMapping(value = "/api/employee/register")
@RequiredArgsConstructor
public class RegisterEmployeeController {
    private final RegisterEmployeeControllerService controllerService;
    private final SaveListEmployeeWithSkillsRepository repository;

    @PostMapping
    int register(@RequestBody ApiRegisterEmployeeSource source) {
        var target = controllerService.handle(source);
        return repository.save(target);
    }
}
