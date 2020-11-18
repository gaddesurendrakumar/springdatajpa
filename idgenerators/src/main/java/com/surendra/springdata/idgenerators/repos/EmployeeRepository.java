package com.surendra.springdata.idgenerators.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.surendra.springdata.idgenerators.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	 List<Employee> findByName(String name);
}
