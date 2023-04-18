package com.example.demo;

import com.example.demo.domain.Person;
import com.example.demo.repositories.PersonRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		PersonRepository personRepository = context.getBean(PersonRepository.class);
		personRepository.save(new Person("Tyler", "Durden"));
		personRepository.save(new Person("Marla", "Singer"));
	}

}
