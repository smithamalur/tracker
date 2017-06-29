package me.smalur;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@ComponentScan(basePackages = "me.smalur")
@Configuration
@EnableWebMvc
public class Application
{
}
