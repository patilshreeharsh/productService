package com.product;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {
// http://localhost:9090/swagger-ui/index.html#/
	@Bean
	public OpenAPI userMicroserviceOpenAPI() {
		return new OpenAPI()
				.info(new Info().title("Electronic Store")
						.description("Api to Featch/update/add products")
						.version("1.0"));
	}
}
