package employee_skills.api.provider.item;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.when;

import employee_skills.api.dto.item.ApiItem.ApiItem;
import employee_skills.api.persistence.database.postgresql.skill.FindListSkillMapper;
import employee_skills.core.domain.model.skill.SkillWithGenre;

@ExtendWith(MockitoExtension.class)
class EsItemProviderTest {

    @BeforeEach
    void setUp() {
        when(findListSkillMapper.findBy())
                .thenReturn(List.of(
                        SkillWithGenre.builder().skillId("s1").skillName("sn1").build(),
                        SkillWithGenre.builder().skillId("s2").skillName("sn2").build()
                ));
    }

    @Test
    void getSkillList() {
        var actual = target.getSkillList();
        var expected = List.of(
                ApiItem.builder().label("sn1").value("s1").build(),
                ApiItem.builder().label("sn2").value("s2").build()
        );

        assertThat(actual, is(expected));
    }

    @InjectMocks
    private EsItemProvider target;
    @Mock(lenient = true)
    private FindListSkillMapper findListSkillMapper;
}