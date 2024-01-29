// Main application class for launching the e-commerce application
package com.assessment.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceApplication {

	/**
	 * Main method to launch the Spring Boot application.
	 *
	 * @param args Command-line arguments passed to the application.
	 */
	public static void main(String[] args) {
		SpringApplication.run(EcommerceApplication.class, args);
	}

}
