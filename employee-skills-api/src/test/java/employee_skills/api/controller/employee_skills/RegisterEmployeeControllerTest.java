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
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import employee_skills.api.controller_service.employee_skills.RegisterEmployeeControllerService;
import employee_skills.api.dto.employee_skills.ApiRegisterEmployeeSource;
import employee_skills.api.persistence.database.postgresql.employee_skills.SaveListEmployeeWithSkillsRepository;
import employee_skills.core.domain.model.employee_skills.EmployeeSkills;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class RegisterEmployeeControllerTest {

    @BeforeEach
    void setUp() {
        when(service.handle(ApiRegisterEmployeeSource.builder()
                .employeeNo("employeeNo")
                .lastName("lastName")
                .firstName("firstName")
                .joinYear("2021")
                .skillList(List.of("s1", "s2"))
                .build()))
                .thenReturn(EmployeeSkills.builder().build());

        when(repository.save(EmployeeSkills.builder().build()))
                .thenReturn(1);

        mockMvc = MockMvcBuilders.standaloneSetup(target).build();
    }

    @Test
    @DisplayName("communication test")
    void registerCommunication() throws Exception {
        var objectMapper = new ObjectMapper();

        mockMvc.perform(MockMvcRequestBuilders
                        .post("/api/employee/register")
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .content(objectMapper.writeValueAsString(ApiRegisterEmployeeSource.builder()
                                .employeeNo("employeeNo")
                                .lastName("lastName")
                                .firstName("firstName")
                                .joinYear("2021")
                                .skillList(List.of("s1", "s2"))
                                .build()))
                )
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("method test")
    void register() {
        var source = ApiRegisterEmployeeSource.builder()
                .employeeNo("employeeNo")
                .lastName("lastName")
                .firstName("firstName")
                .joinYear("2021")
                .skillList(List.of("s1", "s2"))
                .build();
        var actual = target.register(source);
        var expected = 1;

        assertThat(actual, is(expected));
    }

    @InjectMocks
    private RegisterEmployeeController target;
    @Mock(lenient = true)
    private RegisterEmployeeControllerService service;
    @Mock(lenient = true)
    private SaveListEmployeeWithSkillsRepository repository;
    private MockMvc mockMvc;
}