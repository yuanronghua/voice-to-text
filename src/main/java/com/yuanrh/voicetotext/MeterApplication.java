package com.yuanrh.voicetotext;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.yuanrh.voicetotext.controller" })
public class MeterApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeterApplication.class, args);
	}

}
