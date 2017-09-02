package com.eurekaclient.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class DemoController {

	@Value("${words}")
	String words;
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public @ResponseBody Word getWord() {
	    String[] wordArray = words.split(",");
	    int i = (int)Math.round(Math.random() * (wordArray.length - 1));
	    Word w = new Word();
	    w.setWord(wordArray[i]);
	    return w;
	}
}
