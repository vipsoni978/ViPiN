package com.firstgitpro.restapi.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class RestapiApplication {


 @Bean
  public RestTemplate getrestTemplate() {
	  
	return new RestTemplate();
  }



	public static void main(String[] args) {
		SpringApplication.run(RestapiApplication.class, args);
	}

}
