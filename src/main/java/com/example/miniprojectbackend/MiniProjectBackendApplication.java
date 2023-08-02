package com.example.miniprojectbackend;

import com.example.miniprojectbackend.model.Employee;
import com.example.miniprojectbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MiniProjectBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MiniProjectBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
		Employee employee = new Employee();
		employee.setFirstName("Lam");
		employee.setLastName("Hung");
		employee.setEmailId("hung@gmail.com");
		employeeRepository.save(employee);

		Employee employee1 = new Employee();
		employee1.setFirstName("Tran");
		employee1.setLastName("Tuan");
		employee1.setEmailId("tuan@gmail.com");
		employeeRepository.save(employee1);
	}
}
