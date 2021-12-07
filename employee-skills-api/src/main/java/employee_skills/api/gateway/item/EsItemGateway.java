package employee_skills.api.gateway.item;

import java.util.List;

import employee_skills.api.dto.item.ApiItem.ApiItem;

public interface EsItemGateway {

    List<ApiItem> getSkillList();
}
