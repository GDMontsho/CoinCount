package com.coincount;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class CoinCountApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoinCountApplication.class, args);
		//1. I want to load .env file before strting app so my app has access to credentials

		Dotenv dotenv = Dotenv.configure().load();
		dotenv.entries().forEach(entry -> {
			System.setProperty(entry.getKey(), entry.getValue());
		});

		SpringApplication.run(CoinCountApplication.class, args);
	}

}
