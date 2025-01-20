package com.consumer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consumer.client.ProducerServiceClient;

@Service
public class FeignService {

	@Autowired
	ProducerServiceClient producerServiceClient;

	public String getGreetingFromProducer() {
		return producerServiceClient.getGreeting(); // Call Producer Service through Feign client
	}
}
