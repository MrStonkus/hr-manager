package com.example.demo.hr_manager;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	public List<Employee> getEmployees() {
		return List.of(new Employee(1L, "Tomas", 11L, 2L, "manager", 25000));
	}

	public void addNewEmployee(Employee employee) {
		// TODO add new employee logic
	}

	public void deleteEmployee(Long employee_id) {
		// TODO add delete employee logic
	}
}
