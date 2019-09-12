package net.psoap.spring.cloud.eureka.client;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class EurekaClientApp {

    @Value("${spring.application.name}")
    private String appName;

    @Autowired
    private EurekaClient eurekaClient;

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApp.class, args);
    }

    @GetMapping(value = "/greeting")
    public String getGreeting() {
        return "Hello from " + eurekaClient.getApplication(appName).getName();
    }
}
