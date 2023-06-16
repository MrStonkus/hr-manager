package com.example.demo.hr_manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	private final EmployeeRepository employeeRepository;

	@Autowired
	public EmployeeService(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}

	public void addNewEmployee(Employee employee) {
		// TODO insert name check by task
		if (employee.getSalary() < 22000) {
			throw new IllegalStateException(" salary can not be lower than 22000");
		}
		employeeRepository.save(employee);
	}

	public void deleteEmployee(Long employee_id) {
		// TODO add delete employee logic
	}
}
