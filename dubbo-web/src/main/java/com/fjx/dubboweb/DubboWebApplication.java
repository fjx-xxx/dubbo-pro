package com.fjx.dubboweb;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class DubboWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(DubboWebApplication.class, args);
	}

}
