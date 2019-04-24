package com.qf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages={"com.qf.mapper"})
public class J1808TourismApplication {

	public static void main(String[] args) {
		SpringApplication.run(J1808TourismApplication.class, args);
	}

}
