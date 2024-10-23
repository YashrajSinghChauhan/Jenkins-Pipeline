package com.jenkins.JenkinsProject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JenkinsProjectApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("Jenkins Test Executed...");
		assertEquals(true, true);
	}

}
