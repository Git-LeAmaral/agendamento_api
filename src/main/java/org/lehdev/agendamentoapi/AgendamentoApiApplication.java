package org.lehdev.agendamentoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.lehdev.agendamentoapi")
public class AgendamentoApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendamentoApiApplication.class, args);
	}

}
