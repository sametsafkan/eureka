package com.urekaverb.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@Value("${words}")
	String words;
	@RequestMapping("/")
	public Word getWord() {
	    String[] wordArray = words.split(",");
	    int i = (int)Math.round(Math.random() * (wordArray.length - 1));
	    Word w = new Word();
	    w.setWord(wordArray[i]);
	    return w;
	}
}
