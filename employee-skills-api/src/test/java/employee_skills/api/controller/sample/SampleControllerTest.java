package employee_skills.api.controller.sample;

import java.time.LocalDateTime;

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

import employee_skills.api.controller_service.sample.SampleControllerService;
import employee_skills.api.dto.sample.ApiSample;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class SampleControllerTest {

    @BeforeEach
    void setUp() {
        when(sampleControllerService.handle(API_SAMPLE_SOURCE))
                .thenReturn(API_SAMPLE_RESULT);

        mockMvc = MockMvcBuilders.standaloneSetup(target).build();
    }

    @Test
    @DisplayName("GET communication test")
    void getSampleCommunication() throws Exception {
        mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/api/sample")
                                .param("id", "1")
                                .param("name", "sample")
                )
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("GET method test")
    void getSample() {
        var actual = target.getSample(1, "sample");
        var expected = API_SAMPLE_RESULT;

        assertThat(actual, is(expected));
    }

    @Test
    @DisplayName("POST communication test")
    void postSampleCommunication() throws Exception {
        var objectMapper = new ObjectMapper();

        mockMvc.perform(MockMvcRequestBuilders
                        .post("/api/sample")
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
                        .content(objectMapper.writeValueAsString(API_SAMPLE_SOURCE))
                )
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("POST method test")
    void postSample() {
        var actual = target.postSample(API_SAMPLE_SOURCE);
        var expected = API_SAMPLE_RESULT;

        assertThat(actual, is(expected));
    }

    @InjectMocks
    private SampleController target;
    @Mock(lenient = true)
    private SampleControllerService sampleControllerService;
    private MockMvc mockMvc;

    private static final ApiSample API_SAMPLE_SOURCE = ApiSample.builder()
            .id(1)
            .name("sample")
            .datetime(LocalDateTime.of(2020, 10, 1, 0, 0, 0).toString())
            .build();
    private static final ApiSample API_SAMPLE_RESULT = ApiSample.builder()
            .id(2)
            .name("sample2")
            .datetime(LocalDateTime.of(2020, 11, 1, 0, 0, 0).toString())
            .build();
}