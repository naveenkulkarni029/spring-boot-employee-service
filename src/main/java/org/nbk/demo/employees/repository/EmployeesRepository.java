package org.nbk.demo.employees.repository;

import java.util.List;

import org.nbk.demo.employees.domain.Employee;

public interface EmployeesRepository {

	public void save(Employee employee);

	public Employee get(String employeeEmail);

	public List<Employee> list();

}