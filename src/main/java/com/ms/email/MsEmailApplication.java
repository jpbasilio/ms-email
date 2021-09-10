package com.ms.email;
/**
 * Microservice para envio de email utilizando
 * Spring Email e o servidor SMTP do Gmail.
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsEmailApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsEmailApplication.class, args);
	}

}
