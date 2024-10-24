package com.jenkins.JenkinsProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsProjectApplication {
	
	public static void main(String[] args) {
		System.out.println("Jenkins Project Execution Started...");
		System.out.println("Java Version: " + System.getProperty("java.version"));
	   // checkMavenVersion();
		SpringApplication.run(JenkinsProjectApplication.class, args);
		
	}
	 

}
