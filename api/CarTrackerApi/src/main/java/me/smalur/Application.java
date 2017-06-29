package me.smalur;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@ComponentScan(basePackages = "me.smalur")
@Configuration
@EnableWebMvc
public class Application extends WebMvcConfigurerAdapter {
     @Override
    public void addCorsMappings(CorsRegistry registry){
         registry.addMapping("/api**")
                 .allowedOrigins("http://mocker.egen.io")
                 .allowedMethods("PUT", "POST", "GET", "HEAD", "OPTIONS", "DELETE")
                 .allowedHeaders("*")
                 .allowCredentials(false).maxAge(3600);
     }
}
