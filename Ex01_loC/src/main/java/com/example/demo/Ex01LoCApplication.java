package com.example.demo;

import study.LgTv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class Ex01LoCApplication {

	public static void main(String[] args) {
//		SpringApplication.run(Ex01LoCApplication.class, args);
		
		TV tv = new LgTv();
		tv.powerOn();
	}

}
