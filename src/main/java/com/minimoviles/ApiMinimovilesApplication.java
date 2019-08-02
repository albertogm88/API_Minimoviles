package com.minimoviles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

import com.minimoviles.configuration.SwaggerConfig;

@SpringBootApplication
@Import(SwaggerConfig.class)
public class ApiMinimovilesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiMinimovilesApplication.class, args);
	}
	
	
	 public void addResourceHandlers(ResourceHandlerRegistry registry) {
	         registry.addResourceHandler("swagger-ui.html")
	                  .addResourceLocations("classpath:/resources/");
	  }

}
