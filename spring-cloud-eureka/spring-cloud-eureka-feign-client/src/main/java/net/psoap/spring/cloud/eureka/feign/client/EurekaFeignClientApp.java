package net.psoap.spring.cloud.eureka.feign.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableFeignClients
@RestController
public class EurekaFeignClientApp {

    @Autowired
    GreetingClient greetingClient;

    @GetMapping(value = "/gr")
    public String greeting(){
        return greetingClient.greeting();
    }

    public static void main(String[] args) {
        SpringApplication.run(EurekaFeignClientApp.class, args);
    }
}
