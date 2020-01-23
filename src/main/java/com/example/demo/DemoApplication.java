package com.example.demo;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ImportResource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootApplication
//@ImportResource({"classpath:spring/camel-context.xml"})
//@EnableSwagger2
@RestController
public class DemoApplication {

	@RequestMapping("/hello")
	public String sayHi() {
		return "Hi";
	}

}
