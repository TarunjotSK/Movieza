package com.movieza.Movieza;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MoviezaApplication {

	@Value("${MONGO_CLUSTER}")
	private String mongoCluster;

	public static void main(String[] args) {
		SpringApplication.run(MoviezaApplication.class, args);
	}


	@GetMapping("/")
	public String APiReturn()
	{
		System.out.println(mongoCluster);
		return "Hello World!";
	}
}
