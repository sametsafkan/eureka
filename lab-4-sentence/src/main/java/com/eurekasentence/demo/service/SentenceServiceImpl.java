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

	AdjectiveClient adjectiveService;
	ArticleClient articleService;
	NounClient nounService;
	SubjectClient subjectService;
	VerbClient verbService;
	
	@Override
	public String buildSentence() {
		String sentence = "There was a problem assembling the sentence!";
		sentence =  
			String.format("%s %s %s %s %s.",
				subjectService.getWord().getString(),
				verbService.getWord().getString(),
				articleService.getWord().getString(),
				adjectiveService.getWord().getString(),
				nounService.getWord().getString() );
		return sentence;
	}

	@Autowired
	public void setAdjectiveService(AdjectiveClient adjectiveService) {
		this.adjectiveService = adjectiveService;
	}

	@Autowired
	public void setArticleService(ArticleClient articleService) {
		this.articleService = articleService;
	}

	@Autowired
	public void setNounService(NounClient nounService) {
		this.nounService = nounService;
	}

	@Autowired
	public void setSubjectService(SubjectClient subjectService) {
		this.subjectService = subjectService;
	}

	@Autowired
	public void setVerbService(VerbClient verbService) {
		this.verbService = verbService;
	}
	
	

}
