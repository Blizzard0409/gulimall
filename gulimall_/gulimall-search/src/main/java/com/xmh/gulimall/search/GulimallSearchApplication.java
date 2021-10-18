package com.xmh.gulimall.search;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GulimallSearchApplication {
     public static void main(String[] args) {
           SpringApplication.run(GulimallSearchApplication.class, args);
      }
}
