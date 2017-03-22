package com.hit.sherlock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.thymeleaf.spring4.SpringTemplateEngine;

@SpringBootApplication
public class SherlockApplication {

	public static void main(String[] args) {
		SpringApplication.run(SherlockApplication.class, args);
	}
}
