package fr.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaApplicationClient {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplicationClient.class, args);
    }

}
