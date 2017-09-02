package com.msslab2.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Lab3ClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab3ClientApplication.class, args);
	}
}