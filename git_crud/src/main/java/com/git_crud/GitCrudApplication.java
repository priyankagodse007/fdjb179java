package com.git_crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class GitCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitCrudApplication.class, args);
	}

}
