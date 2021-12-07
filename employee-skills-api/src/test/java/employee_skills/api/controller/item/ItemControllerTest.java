package employee_skills.api.controller.item;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import employee_skills.api.dto.item.ApiItem.ApiItem;
import employee_skills.api.gateway.item.EsItemGateway;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class ItemControllerTest {

    @BeforeEach
    void setUp() {
        when(itemGateway.getSkillList())
                .thenReturn(List.of(
                        ApiItem.builder().label("l1").value("v1").build(),
                        ApiItem.builder().label("l2").value("v2").build()
                ));

        mockMvc = MockMvcBuilders.standaloneSetup(target).build();
    }

    @Test
    @DisplayName("communication test")
    void getSkillListCommunication() throws Exception {
        mockMvc.perform(
                        MockMvcRequestBuilders
                                .get("/api/item/skill")
                )
                .andExpect(status().isOk());
    }

    @Test
    @DisplayName("method test")
    void getSkillList() {
        var actual = target.getSkillList();
        var expected = List.of(
                ApiItem.builder().label("l1").value("v1").build(),
                ApiItem.builder().label("l2").value("v2").build()
        );

        assertThat(actual, is(expected));
    }

    @InjectMocks
    private ItemController target;
    @Mock(lenient = true)
    private EsItemGateway itemGateway;
    private MockMvc mockMvc;

}