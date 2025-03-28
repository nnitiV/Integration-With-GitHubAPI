package com.github.api.githubapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.github.api.githubapi")
public class GithubapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubapiApplication.class, args);
	}

}
