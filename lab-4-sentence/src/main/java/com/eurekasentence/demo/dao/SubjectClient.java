package com.eurekasentence.demo.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eurekasentence.demo.domain.Word;

@FeignClient("LAB-6-SUBJECT")
public interface SubjectClient {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Word getWord();
}
