package com.qinfagroup.platform.mine;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 煤矿服务入口
 * @author peng.zhao
 */
@EnableDiscoveryClient
@MapperScan("com.qinfagroup.platform.mine.*.dao")
@SpringBootApplication
public class CoalMineApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoalMineApplication.class, args);
    }

}
