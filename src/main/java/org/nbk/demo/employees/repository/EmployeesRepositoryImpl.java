package org.nbk.demo.employees.repository;

import java.util.List;

import org.nbk.demo.employees.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeesRepositoryImpl implements EmployeesRepository{

	@Autowired
	private MongoTemplate mongoTemplate;

	@Override
	public void save(Employee employee) {
		mongoTemplate.save(employee, "Employees");
		
	}

	@Override
	public Employee get(String employeeId) {
		return mongoTemplate.findById(employeeId, Employee.class, "Employees");
	}

	@Override
	public List<Employee> list() {
		return mongoTemplate.findAll(Employee.class, "Employees");
	}
	
	
	
}