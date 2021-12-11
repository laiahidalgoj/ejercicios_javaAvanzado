package sesiones345.demo.config;

import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

public class SwaggerConfig {
    /**
     * Configuración swagger ui
     * http://localhost:8080/swagger-ui/
     */

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiDetails())
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiDetails() {
        return new ApiInfo("Spring Boot UserBootcamp API REST", " Users Bootcamp Api rest docs", "1.0", "http://www.google.es", new Contact("Laia", "http://www.google.es", "laia@laia.es"), "MIT", "http://www.google.es", Collections.emptyList());
    }

}
