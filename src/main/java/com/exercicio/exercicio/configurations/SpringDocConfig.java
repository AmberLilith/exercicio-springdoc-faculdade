package com.exercicio.exercicio.configurations;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SpringDocConfig{

    @Bean
    public OpenAPI springClientOpenApi() {
        return new OpenAPI()
                .info(new Info().title("Api com Documentação")
                        .description("Exercicio criando documentação de API")
                        .version("1.0")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")))
                        .externalDocs(new ExternalDocumentation()
                                .description("Link repositorio github")
                                .url("https://github.com/AmberLilith/exercicio-springdoc-faculdade")
                );
    }


}
