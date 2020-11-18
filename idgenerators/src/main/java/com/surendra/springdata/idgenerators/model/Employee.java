package com.surendra.springdata.idgenerators.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Employee {
	//@TableGenerator(name = "employee_gen",table = "id_gen",pkColumnName = "gen_name",valueColumnName = "gen_val",allocationSize = 100)
	@Id
	//@GeneratedValue(strategy = GenerationType.TABLE, generator = "employee_gen")
	@GenericGenerator(name = "emp_id", strategy = "com.surendra.springdata.idgenerators.util.CustomIdGenerator")
	@GeneratedValue(generator = "emp_id")
	private Long id;
	private String name ;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
