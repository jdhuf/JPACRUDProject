package com.skilldistillery.teamroster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TeamRosterAppApplication extends SpringBootServletInitializer {
	  @Override
	  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	    return application.sources(TeamRosterAppApplication.class);
	  }

	public static void main(String[] args) {
		SpringApplication.run(TeamRosterAppApplication.class, args);
	}

}
