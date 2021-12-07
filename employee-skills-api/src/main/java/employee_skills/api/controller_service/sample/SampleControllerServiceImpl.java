package employee_skills.api.controller_service.sample;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import employee_skills.api.dto.sample.ApiSample;

@Component
public class SampleControllerServiceImpl
        implements SampleControllerService {

    @Override
    public ApiSample handle(ApiSample source) {
        return ApiSample.builder()
                .id(9)
                .name("converted sample")
                .datetime(LocalDateTime.of(2020, 10, 1, 23, 45, 12).toString())
                .build();
    }
}
