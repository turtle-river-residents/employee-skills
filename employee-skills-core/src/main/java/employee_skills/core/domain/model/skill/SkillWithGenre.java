package employee_skills.core.domain.model.skill;

import lombok.Builder;
import lombok.Value;

@Builder
@Value
public class SkillWithGenre {
    private String genreId;
    private String genreName;
    private String skillId;
    private String skillName;
}
