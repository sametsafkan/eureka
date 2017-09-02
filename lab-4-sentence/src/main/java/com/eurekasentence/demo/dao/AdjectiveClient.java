package com.eurekasentence.demo.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.eurekasentence.demo.domain.Word;

@FeignClient("lab-6-adjective")
public interface AdjectiveClient {
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public Word getWord();
	
	static class HystrixClientFallback implements AdjectiveClient {

		@Override

		public Word getWord() {

		return new Word();

		}	
	}

}
