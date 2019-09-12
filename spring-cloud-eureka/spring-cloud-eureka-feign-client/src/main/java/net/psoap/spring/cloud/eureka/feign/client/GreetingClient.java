package net.psoap.spring.cloud.eureka.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("spring-cloud-eureka-client")
public interface GreetingClient {

    @GetMapping("/greeting")
    String greeting();
}
