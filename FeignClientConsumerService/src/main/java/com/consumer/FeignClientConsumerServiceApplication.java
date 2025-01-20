package com.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignClientConsumerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignClientConsumerServiceApplication.class, args);
	}

}
