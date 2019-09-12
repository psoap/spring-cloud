package net.psoap.spring.cloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClient {

    @Value(value = "${greeting}")
    private String greeting;

    @GetMapping(value = "/greeting")
    public String getGreeting(){
        return greeting;
    }

    public static void main(String[] args) {
        SpringApplication.run(ConfigClient.class, args);
    }
}
