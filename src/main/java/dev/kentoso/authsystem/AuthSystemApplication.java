package dev.kentoso.authsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class AuthSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthSystemApplication.class, args);
	}

}
