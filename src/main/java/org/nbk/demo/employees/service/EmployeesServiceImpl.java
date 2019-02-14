package org.nbk.demo.employees.service;

import java.util.List;

import org.nbk.demo.employees.domain.Employee;
import org.nbk.demo.employees.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeesServiceImpl implements EmployeesService{

	@Autowired
	private EmployeesRepository employeesRepository;

	@Override
	public void save(Employee employee) {
		employeesRepository.save(employee);
		
	}

	@Override
	public Employee get(String employeeId) {
		return employeesRepository.get(employeeId);
	}

	@Override
	public List<Employee> list() {
		return employeesRepository.list();
	}
	
}