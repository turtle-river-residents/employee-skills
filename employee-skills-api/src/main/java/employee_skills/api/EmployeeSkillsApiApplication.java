package employee_skills.api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {
        "employee_skills.api.persistence.database.postgresql.*",
        "employee_skills.backend.persistence.database.postgresql.*"
})
public class EmployeeSkillsApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeSkillsApiApplication.class, args);
    }

}
