package com.hr.manager;

public class Employee {

	private Long employee_id;
	private String name;
	private Long department_id;
	private Long project_id;
	private String role;
	private Integer salary;

	public Employee() {

	}

	public Employee(Long employee_id, String name, Long department_id, Long project_id, String role, Integer salary) {
		this.employee_id = employee_id;
		this.name = name;
		this.department_id = department_id;
		this.project_id = project_id;
		this.role = role;
		this.salary = salary;
	}

	public Employee(String name, Long department_id, Long project_id, String role, Integer salary) {
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

	public Long getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(Long department_id) {
		this.department_id = department_id;
	}

	public Long getProject_id() {
		return project_id;
	}

	public void setProject_id(Long project_id) {
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
