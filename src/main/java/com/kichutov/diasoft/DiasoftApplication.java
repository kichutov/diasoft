package com.kichutov.diasoft;

import io.sentry.Sentry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DiasoftApplication {

	public static void main(String[] args) {
		Sentry.captureMessage("Application started!");
		SpringApplication.run(DiasoftApplication.class, args);
	}

}
