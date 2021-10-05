package com.hkimbrough22.songr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SongrApplication {

	public static void main(String[] args) {
		SpringApplication.run(SongrApplication.class, args);
	}

}
