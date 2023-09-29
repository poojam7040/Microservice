package com.velocity.praveen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient ===== This annotation will register this application api to edureka server
@EnableDiscoveryClient
public class ElectronicsShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElectronicsShopApplication.class, args);
	}

}
