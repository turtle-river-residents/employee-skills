package employee_skills.api.controller.sample;

import java.time.LocalDateTime;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import employee_skills.api.controller_service.sample.SampleControllerService;
import employee_skills.api.dto.sample.ApiSample;

@RestController
@RequestMapping(value = "/api/sample")
@RequiredArgsConstructor
public class SampleController {

    private final SampleControllerService sampleControllerService;

    @GetMapping
    public ApiSample getSample(@RequestParam("id") Integer id, @RequestParam("name") String name) {
        var apiSample = ApiSample.builder()
                .id(id)
                .name(name)
                .datetime(LocalDateTime.of(2020, 10, 1, 0, 0, 0).toString())
                .build();

        return sampleControllerService.handle(apiSample);
    }

    @PostMapping
    public ApiSample postSample(@RequestBody ApiSample apiSample) {
        return sampleControllerService.handle(apiSample);
    }
}
