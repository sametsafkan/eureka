package com.msslab2.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class ClientController{
	
	@Value("${ms}") String message;
	
	@RequestMapping("/")
	public String message() {
		return message;
	}
}