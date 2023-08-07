package com.example.miniprojectbackend;

import com.example.miniprojectbackend.model.Employee;
import com.example.miniprojectbackend.repository.EmployeeRepository;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(title = "Employees API", version = "1.0.0"),
		servers = {@Server(url = "http://miniproject-env.eba-4m29msi8.ap-southeast-2.elasticbeanstalk.com")})
public class MiniProjectBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MiniProjectBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
//		Employee employee = new Employee();
//		employee.setFirstName("Lam");
//		employee.setLastName("Hung");
//		employee.setEmailId("hung@gmail.com");
//		employeeRepository.save(employee);
//
//		Employee employee1 = new Employee();
//		employee1.setFirstName("Tran");
//		employee1.setLastName("Tuan");
//		employee1.setEmailId("tuan@gmail.com");
//		employeeRepository.save(employee1);
	}
}
