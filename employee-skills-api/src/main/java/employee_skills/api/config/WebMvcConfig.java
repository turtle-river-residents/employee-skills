package employee_skills.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import employee_skills.api.support.cross_origin.CrossOrigin;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Bean
    public CrossOrigin crossOrigin() {
        return new CrossOrigin();
    }

    public void addCorsMappings(CorsRegistry registry) {
        CrossOrigin crossOriginItem = crossOrigin();

        registry.addMapping("/**")
                .allowedOrigins(crossOriginItem.getAllowedOrigins())
                .allowedMethods(crossOriginItem.getAllowedMethods());
    }
}
