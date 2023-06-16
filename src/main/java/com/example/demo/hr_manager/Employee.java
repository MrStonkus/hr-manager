package com.example.demo.hr_manager;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table
public class Employee {

	@Id
	@SequenceGenerator(name = "employee_sequence", sequenceName = "employee_sequence", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_sequence")
	private Long employee_id;
	private String name;
	private Integer department_id;
	private Integer project_id;
	private String role;
	private Integer salary;

	public Employee() {

	}

	public Employee(Long employee_id, String name, Integer department_id, Integer project_id, String role,
			Integer salary) {
		this.employee_id = employee_id;
		this.name = name;
		this.department_id = department_id;
		this.project_id = project_id;
		this.role = role;
		this.salary = salary;
	}

	public Employee(String name, Integer department_id, Integer project_id, String role, Integer salary) {
		this.name = name;
		this.department_id = department_id;
		this.project_id = project_id;
		this.role = role;
		this.salary = salary;
	}

	public Long getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(Long employee_id) {
		this.employee_id = employee_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}

	public Integer getProject_id() {
		return project_id;
	}

	public void setProject_id(Integer project_id) {
		this.project_id = project_id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee{" + "employee_id=" + employee_id + ", name'" + name + '\'' + ", department_id'" + department_id
				+ '\'' + ", project_id'" + project_id + '\'' + ", role'" + role + '\'' + ", salary'" + salary + '\''
				+ '}';
	}

}
