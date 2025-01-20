package com.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name = "producer-service", url = "http://localhost:8008")  // URL of the Producer Service
public interface ProducerServiceClient {

    @GetMapping("/feignproducer/callingproducer")
    String getGreeting();
}