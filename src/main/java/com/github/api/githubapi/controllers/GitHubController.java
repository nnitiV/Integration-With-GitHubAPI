package com.github.api.githubapi.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GitHubController {

	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/test")
	public String test() {
		String urlString = "http://localhost:8080/";
		RestTemplate restTemplate = new RestTemplate();
		String resultString = restTemplate.getForObject(urlString, String.class);
		return resultString + " | some differences";
	}
	
}
