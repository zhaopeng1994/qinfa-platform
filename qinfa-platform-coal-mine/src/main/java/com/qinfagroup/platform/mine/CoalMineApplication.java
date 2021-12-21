package com.qinfagroup.platform.mine;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@MapperScan("com.qinfagroup.platform.mine.*.dao")
@SpringBootApplication
public class CoalMineApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoalMineApplication.class, args);
    }

}
