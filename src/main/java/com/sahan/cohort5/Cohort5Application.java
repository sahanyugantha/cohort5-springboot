package com.sahan.cohort5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
@Configuration
public class Cohort5Application implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(Cohort5Application.class, args);
	}

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry
				.addMapping("/**")
				.allowedOrigins("http://localhost:3000") // for any URL "*"
				.allowedOrigins("*"); //"GET", "POST", "PUT", "DELETE"
	}
}
