package com.example.abbs.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@PropertySource("classpath:static/data/myKeys.properties")
@Controller
public class TestController {
	@Value("${key}") private String value;
	@Value("${server.port}") private int port;
	
	@GetMapping("/index")
	public String index() {
		return "index";
	}

	@ResponseBody
	@GetMapping("/value") 
	public String value() {
		return "value=" + value + ", port=" + port;
	}
	
}
