package com.eurekasentence.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
@EnableHystrixDashboard
@ComponentScan({"com.eurekasentence.demo.domain","com.eurekasentence.demo.controller","com.eurekasentence.demo.service","com.eurekasentence.demo.dao"})
public class Lab4SentenceApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab4SentenceApplication.class, args);
	}
}
