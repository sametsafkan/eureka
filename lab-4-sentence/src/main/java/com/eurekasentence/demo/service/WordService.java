package com.eurekasentence.demo.service;

import com.eurekasentence.demo.domain.Word;

public interface WordService {

	Word getSubject();

	Word getVerb();

	Word getArticle();

	Word getAdjective();

	Word getNoun();

}
