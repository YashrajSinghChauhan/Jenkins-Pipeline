package com.jenkins.JenkinsProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsProjectApplication {

	public static void main(String[] args) {
		System.out.println("Jenkins Project Execution Started...");
		SpringApplication.run(JenkinsProjectApplication.class, args);
	}

}
