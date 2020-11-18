package com.surendra.springdata.jpqlandnativesql.repos;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.surendra.springdata.jpqlandnativesql.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
	@Query("from Student")
	List<Student> findAllStudents() ;
	
	@Query("select st.firstName,st.lastName from Student st")
	List<Object[]> findAllStudentsPartialData() ;
	@Query("from Student where firstName=:firstName")
	List<Student> findAllStudentsWithFirstName(@Param("firstName") String firstName) ;

}
