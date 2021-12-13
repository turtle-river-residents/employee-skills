package employee_skills.api.persistence.database.postgresql.skill_with_genre;

import java.util.List;

import com.github.springtestdbunit.TransactionDbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DbUnitConfiguration;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import employee_skills.api.persistence.database.CsvDataSetLoader;
import employee_skills.core.domain.model.skill.SkillWithGenre;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
@TestExecutionListeners({
        DependencyInjectionTestExecutionListener.class,
        TransactionDbUnitTestExecutionListener.class
})
@ActiveProfiles("local")
@DbUnitConfiguration(dataSetLoader = CsvDataSetLoader.class)
class FindListSkillWithGenreMapperTest {

    @Test
    @DatabaseSetup("/dbunit/postgresql/skill_with_genre/FindListSkillWithGenreMapper/findBy/setup/")
    void findBy() {
        var actual = target.findBy("ABC00001");
        var expected = List.of(
                SkillWithGenre.builder()
                        .genreId("1")
                        .genreName("genre1")
                        .skillId("1")
                        .skillName("skill1")
                        .build(),
                SkillWithGenre.builder()
                        .genreId("2")
                        .genreName("genre2")
                        .skillId("4")
                        .skillName("skill4")
                        .build()
        );

        assertThat(actual, is(expected));
    }

    @Autowired
    private FindListSkillWithGenreMapper target;
}