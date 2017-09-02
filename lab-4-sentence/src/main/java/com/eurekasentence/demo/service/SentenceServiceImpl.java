package com.eurekasentence.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eurekasentence.demo.dao.AdjectiveClient;
import com.eurekasentence.demo.dao.ArticleClient;
import com.eurekasentence.demo.dao.NounClient;
import com.eurekasentence.demo.dao.SubjectClient;
import com.eurekasentence.demo.dao.VerbClient;

@Service
public class SentenceServiceImpl implements SentenceService {

	WordService wordService;
	
	@Override
	public String buildSentence() {
		return
		String.format("%s %s %s %s %s.",
				wordService.getSubject().getString(),
				wordService.getVerb().getString(),
				wordService.getArticle().getString(),
				wordService.getAdjective().getString(),
				wordService.getNoun().getString() );
	}

	@Autowired
	public void setWordService(WordService wordService) {
		this.wordService = wordService;
	}
}
