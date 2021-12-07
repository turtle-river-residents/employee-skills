package employee_skills.api.persistence.database.postgresql.skill;

import java.util.List;

import employee_skills.core.domain.model.skill.SkillWithGenre;

public interface FindListSkillMapper {

    List<SkillWithGenre> findBy();
}
