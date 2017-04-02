package com.tt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@ComponentScan({"controller","service"})
public class SlackServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SlackServiceApplication.class, args);
	}
}
