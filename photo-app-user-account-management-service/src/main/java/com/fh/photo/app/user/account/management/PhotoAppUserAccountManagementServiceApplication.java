package com.fh.photo.app.user.account.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PhotoAppUserAccountManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhotoAppUserAccountManagementServiceApplication.class, args);
	}

}
