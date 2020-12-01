package com.yisheng.zzu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan
public class ZzuApplication {
	public static void main(String[] args) {
		SpringApplication.run(ZzuApplication.class, args);
	}
}