package com.eurekasentence.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.eurekasentence.demo.service.SentenceService;

@RestController
public class SentenceController {

	@Autowired SentenceService sentenceService;

	@RequestMapping("/sentence")
	public @ResponseBody String getSentence() {
		return 
				"<h3>Some Sentences</h3><br/>" +	  
				sentenceService.buildSentence() + "<br/><br/>" +
				sentenceService.buildSentence() + "<br/><br/>" +
				sentenceService.buildSentence() + "<br/><br/>" +
				sentenceService.buildSentence() + "<br/><br/>" +
				sentenceService.buildSentence() + "<br/><br/>"
				;
	}
}
