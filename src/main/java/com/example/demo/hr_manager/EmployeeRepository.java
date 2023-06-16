package com.example.demo.hr_manager;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

	/*
	 * @Query("SELECT s FROM Student s WHERE s.email = ?1") Optional<Employee>
	 * findStudentByEmail(String email);
	 */

}