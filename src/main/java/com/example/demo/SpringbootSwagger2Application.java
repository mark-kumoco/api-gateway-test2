package com.example.demo;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;


@SpringBootApplication
@EnableSwagger2
public class SpringbootSwagger2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootSwagger2Application.class, args);
	}

	@Bean
	public Docket swaggerConfiguration() {

		Contact contact = new Contact(
			"ML",
			"http://ok",
			"ok@ok.com"
		);
		
		List<VendorExtension> vendorExtensions = new ArrayList<>();
	
		ApiInfo apiInfo = new ApiInfo(
				"Address book API",
				"Sample API for me",
				"1.1",
				"http://okok",
				"Mark",
				"Free to use",
				"vendorExtensions"
				);

		Docket docket = new Docket(DocumentationType.SWAGGER_2)
			.apiInfo(apiInfo)
			.select()
			.apis(RequestHandlerSelectors.basePackage("com.example.demo"))
			.paths(PathSelectors.ant("/api/*"))
			.build();
			
			
		return docket;
	}
}
