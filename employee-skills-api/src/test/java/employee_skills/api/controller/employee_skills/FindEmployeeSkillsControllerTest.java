package employee_skills.api.controller.employee_skills;

import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import employee_skills.api.controller_service.employee_skills.FindListEmployeeWithSkillsControllerService;
import employee_skills.api.dto.employee.ApiEmployeeCriteria;
import employee_skills.api.dto.employee_skills.ApiEmployeeWithSkillsResult;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class FindEmployeeSkillsControllerTest {

    @BeforeEach
    void setUp() {
        when(service.handle(CRITERIA))
                .thenReturn(List.of(
                                ApiEmployeeWithSkillsResult.builder()
                                        .employeeNo("1")
                                        .name("name1")
                                        .joinYear(2021)
                                        .skillNameList("skill1 skill2")
                                        .build(),
                                ApiEmployeeWithSkillsResult.builder()
                                        .employeeNo("2")
                                        .name("name2")
                                        .joinYear(2021)
                                        .skillNameList("skill3 skill3")
                                        .build()
                        )
                );

        mockMvc = MockMvcBuilders.standaloneSetup(target).build();
    }

    @Test
    @DisplayName("communication test")
    void handleCommunication() throws Exception {
        var objectMapper = new ObjectMapper();

        mockMvc.perform(MockMvcRequestBuilders
                        .post("/api/employeeSkills/find")
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .content(objectMapper.writeValueAsString(CRITERIA))
                )
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("method test")
    void handle() {
        var source = CRITERIA;
        var actual = target.handle(source);
        var expected = List.of(
                ApiEmployeeWithSkillsResult.builder()
                        .employeeNo("1")
                        .name("name1")
                        .joinYear(2021)
                        .skillNameList("skill1 skill2")
                        .build(),
                ApiEmployeeWithSkillsResult.builder()
                        .employeeNo("2")
                        .name("name2")
                        .joinYear(2021)
                        .skillNameList("skill3 skill3")
                        .build()
        );

        assertThat(actual, is(expected));
    }

    @InjectMocks
    private FindEmployeeSkillsController target;
    @Mock(lenient = true)
    private FindListEmployeeWithSkillsControllerService service;
    private MockMvc mockMvc;

    private final static ApiEmployeeCriteria CRITERIA = ApiEmployeeCriteria.builder()
            .dummy("dummy")
            .build();

}