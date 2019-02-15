package org.nbk.demo.employees.service;

import java.util.List;

import org.nbk.demo.employees.domain.Employee;

public interface EmployeesService {

	public void save(Employee employee);

	public Employee get(String employeeEmail);

	public List<Employee> list();
	
}