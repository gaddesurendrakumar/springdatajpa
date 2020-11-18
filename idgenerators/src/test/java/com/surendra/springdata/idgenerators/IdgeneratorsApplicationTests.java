package com.surendra.springdata.idgenerators;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.surendra.springdata.idgenerators.model.Employee;
import com.surendra.springdata.idgenerators.repos.EmployeeRepository;

@SpringBootTest
class IdgeneratorsApplicationTests {

	@Autowired
	EmployeeRepository repository;
	@Test
	void testCreateEmployee() {
		
		Employee emp = new Employee();
		//emp.setId(123L);
		emp.setName("Surendra");
		repository.save(emp);
	}
	
	

}
