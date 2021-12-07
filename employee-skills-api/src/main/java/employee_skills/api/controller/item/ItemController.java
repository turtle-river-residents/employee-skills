package employee_skills.api.controller.item;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import employee_skills.api.dto.item.ApiItem.ApiItem;
import employee_skills.api.gateway.item.EsItemGateway;

@RestController
@RequestMapping(value = "/api/item")
@RequiredArgsConstructor
public class ItemController {
    private final EsItemGateway itemGateway;

    @GetMapping(value = "/skill")
    public List<ApiItem> getSkillList() {
        return itemGateway.getSkillList();
    }
}
