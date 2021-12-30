package com.qinfagroup.platform.generator;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 代码生成服务入口
 *
 * @author peng.zhao
 */
@SpringBootApplication(scanBasePackages = "com.qinfagroup.platform.*")
@MapperScan("com.qinfagroup.platform.generator.dao")
public class GeneratorApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeneratorApplication.class, args);
	}

}
