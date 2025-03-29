package com.github.api.githubapi.controllers;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.api.githubapi.entities.GitHubResponse;

@RestController
public class GitHubController {

	@Autowired
	private ObjectMapper objectMapper;

	@RequestMapping("/")
	public String home() {
		return "home";
	}

	@RequestMapping("/test")
	public String test(@RequestParam("username") String username) {
		String url = "https://api.github.com/users/" + username + "/events";
		RestTemplate restTemplate = new RestTemplate();
		String result = restTemplate.getForObject(url, String.class);
		try {
			List<GitHubResponse> gitHubResponses = objectMapper.readValue(restTemplate.getForObject(url, String.class),
					new TypeReference<List<GitHubResponse>>() {
					});
			StringBuilder stringToPrint = new StringBuilder();
			gitHubResponses.stream().forEach(response -> {
				stringToPrint.append("Action id: " + response.getId());
				stringToPrint.append("<br>");
				stringToPrint.append("Type: " + response.getType());
				stringToPrint.append("<br>");
				stringToPrint.append("Actor: [");
				stringToPrint.append("<br>");
				stringToPrint.append("id: " + response.getActor().getId());
				stringToPrint.append("<br>");
				stringToPrint.append("Username: " + response.getActor().getUsername());
				stringToPrint.append("<br>");
				stringToPrint.append("Display login: " + response.getActor().getDisplayLogin());
				stringToPrint.append("<br>");
				stringToPrint.append("Gravatar id: " + response.getActor().getGravatar_id());
				stringToPrint.append("<br>");
				stringToPrint.append("Url: " + response.getActor().getUrl());
				stringToPrint.append("<br>");
				stringToPrint.append("Avatar url: " + response.getActor().getAvatarUrl());
				stringToPrint.append("<br>");
				stringToPrint.append("]");
				stringToPrint.append("<br>");
				stringToPrint.append("Repo: [");
				stringToPrint.append("<br>");
				stringToPrint.append("id: " + response.getRepo().getId());
				stringToPrint.append("<br>");
				stringToPrint.append("Name: " + response.getRepo().getName());
				stringToPrint.append("<br>");
				stringToPrint.append("Url: " + response.getRepo().getUrl());
				stringToPrint.append("<br>");
				stringToPrint.append("]");
				stringToPrint.append("<br>");
				stringToPrint.append("Payload: [");
				stringToPrint.append("<br>");
				stringToPrint.append("Ref: " + response.getPayload().getRef());
				stringToPrint.append("<br>");
				stringToPrint.append("Ref type: " + response.getPayload().getRefType());
				stringToPrint.append("<br>");
				stringToPrint.append("Get master branch: " + response.getPayload().getMasterBranch());
				stringToPrint.append("<br>");
				stringToPrint.append("Get description: " + response.getPayload().getDescription());
				stringToPrint.append("<br>");
				stringToPrint.append("Get pusher type: " + response.getPayload().getPusherType());
				stringToPrint.append("<br>");
				stringToPrint.append("]");
				stringToPrint.append("<br>");
				stringToPrint.append("Is public? " + response.isPublic());
				stringToPrint.append("<br>");
				stringToPrint.append("Created at: " + response.getData());
				stringToPrint.append("<br>");
				stringToPrint.append("============================");
				stringToPrint.append("<br>");
			});
			return stringToPrint.toString();
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return "No results found";
	}

}
