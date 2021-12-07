package employee_skills.api.provider.item;

import java.util.ArrayList;
import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import employee_skills.api.dto.item.ApiItem.ApiItem;
import employee_skills.api.gateway.item.EsItemGateway;
import employee_skills.api.persistence.database.postgresql.skill.FindListSkillMapper;

@Component
@RequiredArgsConstructor
public class EsItemProvider implements EsItemGateway {
    private final FindListSkillMapper findListSkillMapper;

    @Override
    public List<ApiItem> getSkillList() {
        var retList = new ArrayList<ApiItem>();
        findListSkillMapper.findBy().forEach(e ->
                retList.add(ApiItem.builder()
                        .label(e.getSkillName())
                        .value(e.getSkillId())
                        .build())
        );
        return retList;
    }
}
