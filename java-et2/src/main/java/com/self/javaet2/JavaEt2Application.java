package com.self.javaet2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaEt2Application {

	public static OrderBook book;

	public static void main(String[] args) {
		SpringApplication.run(JavaEt2Application.class, args);
	}

}
