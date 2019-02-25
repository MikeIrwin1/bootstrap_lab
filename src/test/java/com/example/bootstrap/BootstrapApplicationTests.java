package com.example.bootstrap;

import com.example.bootstrap.models.Employee;
import com.example.bootstrap.repositories.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BootstrapApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployee(){
		Employee employee = new Employee("Raul", 36, 1234, "raul@gmail.com");
		employeeRepository.save(employee);
	}

	@Test
	public void createMichael(){
		Employee employee = new Employee("Michael", 31, 3154, "michael@gmail.com");
		employeeRepository.save(employee);
	}



}
