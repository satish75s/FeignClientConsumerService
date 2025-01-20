package com.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.consumer.service.FeignService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class FeignController {
	@Autowired
	FeignService feignService;

	@GetMapping("/consume-greeting")
	public String getGreetingFromProducer() {
		log.info("calling producer");
		return feignService.getGreetingFromProducer(); // Call Feign service
	}
}
