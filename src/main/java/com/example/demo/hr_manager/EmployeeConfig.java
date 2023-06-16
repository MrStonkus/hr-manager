package com.example.demo.hr_manager;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig {

	@Bean
	CommandLineRunner commandLineRunner(EmployeeRepository repository) {
		return args -> {
			Employee tom = new Employee("Tomas", 10, 1001, "manager", 25000);
			Employee jerry = new Employee("Jerry", 30, 1002, "director", 40000);

			repository.saveAll(List.of(tom, jerry));
		};
	};
}
