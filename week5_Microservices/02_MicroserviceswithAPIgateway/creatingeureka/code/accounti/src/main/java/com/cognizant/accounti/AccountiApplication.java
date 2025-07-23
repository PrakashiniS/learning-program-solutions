package com.cognizant.accounti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDiscoveryClient
public class AccountiApplication {
    public static void main(String[] args) {
        SpringApplication.run(AccountiApplication.class, args);
    }
}
