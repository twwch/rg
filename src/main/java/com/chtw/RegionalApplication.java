package com.chtw;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(value = "com.chtw.mapper")
@SpringBootApplication
public class RegionalApplication {
	public static void main(String[] args) {
		SpringApplication.run(RegionalApplication.class, args);
	}
}
