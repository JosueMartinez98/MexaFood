package com.mexa.food;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(
	title = "MexaFood API",
	version = "1.0",
	description = "API about the mexican gastronomy food including the recipes, a little description and how to make it"
))
public class MexaFoodApplication {

	public static void main(String[] args) {
		SpringApplication.run(MexaFoodApplication.class, args);
	}

}
