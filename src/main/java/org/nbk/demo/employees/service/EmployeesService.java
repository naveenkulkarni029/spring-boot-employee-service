package org.nbk.demo.employees.service;

import java.util.List;

import org.nbk.demo.employees.domain.Employee;
import org.nbk.demo.employees.response.ResponseEmployee;

public interface EmployeesService {

	public void save(Employee employee);

	public ResponseEmployee get(String employeeEmail);

	public List<Employee> list();
	
}