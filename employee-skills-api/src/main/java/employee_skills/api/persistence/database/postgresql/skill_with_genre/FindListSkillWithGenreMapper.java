package employee_skills.api.persistence.database.postgresql.skill_with_genre;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import employee_skills.core.domain.model.skill.SkillWithGenre;

@Mapper
public interface FindListSkillWithGenreMapper {

    List<SkillWithGenre> findBy(String employeeNo);
}
