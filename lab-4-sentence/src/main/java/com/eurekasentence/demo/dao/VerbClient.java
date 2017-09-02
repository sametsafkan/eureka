package com.eurekasentence.demo.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eurekasentence.demo.domain.Word;

@FeignClient("lab-6-verb")
public interface VerbClient {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Word getWord();
	
	static class HystrixClientFallback implements VerbClient {

		@Override

		public Word getWord() {

		return new Word();

		}	
	}
}
