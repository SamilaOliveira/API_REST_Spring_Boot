package med.voll.api.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//Configuração para o CORS e habilitação de origem específica para consumo da API.
@Configuration
public class CorsConfiguration implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost: 8080") //endereço da aplicação front-end.
                .allowedMethods("GET", "POST", "PUT", "DELETE", "HEAD", "TRACE", "CONNECT"); //métodos que
                // seram permitidos para serem executados.
    }

}
