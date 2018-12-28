package com.mzbloc.elasticsearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:dubbo.xml"})
public class ElsdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElsdemoApplication.class, args);
	}
}
