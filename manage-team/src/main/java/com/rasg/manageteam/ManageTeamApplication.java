package com.rasg.manageteam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class ManageTeamApplication extends SpringBootServletInitializer {

	private static Class<ManageTeamApplication> applicationClass = ManageTeamApplication.class;

	public static void main(String[] args) {
		SpringApplication.run(ManageTeamApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(applicationClass);
	}
}
