package com.surendra.springdata.jpqlandnativesql;

import java.util.List;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.surendra.springdata.jpqlandnativesql.entities.Student;
import com.surendra.springdata.jpqlandnativesql.repos.StudentRepository;

@SpringBootTest
class JpqlandnativesqlApplicationTests {

	@Autowired
	StudentRepository repository;

	@Test
	public void testStudentCreate() {
		Student student = new Student();
		student.setFirstName("John");
		student.setLastName("Ferguson");
		student.setScore(88);

		Student student2 = new Student();
		student2.setFirstName("Bill");
		student2.setLastName("Gates");
		student2.setScore(75);

		repository.save(student);
		repository.save(student2);
	}

	@Test
	public void testFindAllStudents() {
		System.out.println(repository.findAllStudents());
	}
	
	@Test
	public void testFindAllStudentsPartialData() {
	List<Object[]>	 objects = repository.findAllStudentsPartialData();
	for (Object[] objects2 : objects) {
		System.out.println(objects2[0]);
		System.out.println(objects2[1]);
	}
		
	}
	
	@Test
	public void testFindAllStudentsWithFirstName() {
		System.out.println(repository.findAllStudentsWithFirstName("Bill"));
	}
	
	
	@Test
	public void testFindAllStudentsByScores() {
		System.out.println(repository.findStudentsForGivenScores(80, 90));
	}
	
	@Test
	@Transactional
	@Rollback(false)
	public void testDeleteStudentsByFirstName() {
		repository.deleteStudentsByFirstName("Bill");
	}

	@Test
	public void testFindAllStudentNQ() {
		System.out.println(repository.findAllStudentNQ());
	}
	
	@Test
	public void testFindByFirstNameNQ() {
		System.out.println(repository.findByFirstNQ("Bill"));
	}

	
}
