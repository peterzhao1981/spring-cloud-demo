package com.curious;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by xudong on 2016/11/24.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ComputeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComputeServiceApplication.class, args);
    }
}
