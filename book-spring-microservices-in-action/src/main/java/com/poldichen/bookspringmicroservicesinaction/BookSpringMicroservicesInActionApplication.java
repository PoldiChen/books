package com.poldichen.bookspringmicroservicesinaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BookSpringMicroservicesInActionApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BookSpringMicroservicesInActionApplication.class, args);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(this.getClass());
    }

}

