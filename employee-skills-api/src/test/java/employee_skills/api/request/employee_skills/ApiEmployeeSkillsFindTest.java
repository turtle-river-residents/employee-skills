package employee_skills.api.request.employee_skills;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import employee_skills.api.dto.employee.ApiEmployeeCriteria;
import employee_skills.api.dto.employee_skills.ApiEmployeeWithSkillsResult;
import employee_skills.api.request.ApiTest;

public class ApiEmployeeSkillsFindTest extends ApiTest {

    @Test
    @DatabaseSetup("/request/api/employeeSkills/find/setup/")
    public void handleTest() throws JsonProcessingException {
        String url = createUrl("/api/employeeSkills/find");

        var actual = toJsonStr(template
                .postForObject(url, ApiEmployeeCriteria.builder().build(), List.class));

        var expected = toJsonStr(List.of(
                ApiEmployeeWithSkillsResult.builder()
                        .employeeNo("ABC00001")
                        .name("Last1 First1")
                        .joinYear(2010)
                        .skillNameList("skill1\nskill2\n")
                        .build()
        ));

        assertThat(actual, is(expected));
    }
}
