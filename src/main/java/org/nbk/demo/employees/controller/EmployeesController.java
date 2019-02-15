package org.nbk.demo.employees.controller;

import org.nbk.demo.employees.domain.Employee;
import org.nbk.demo.employees.response.ResponseEmployees;
import org.nbk.demo.employees.response.ResponseCreated;
import org.nbk.demo.employees.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeesController {

	@Autowired
	private EmployeesService employeeService;

	@PostMapping(value = "/employees/save", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseCreated> save(@RequestBody Employee employee) {
		employeeService.save(employee);
		return ResponseEntity.ok(new ResponseCreated());
	}

	@GetMapping(value = "/employees/get/{employeeEmail}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employee> get(@PathVariable String employeeEmail) {
		return ResponseEntity.ok(employeeService.get(employeeEmail));
	}

	@GetMapping(value = "/employees/list", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseEmployees> list() {
		ResponseEmployees employeeList = new ResponseEmployees();
		employeeList.setEmployeeList(employeeService.list());
		return ResponseEntity.ok(employeeList);
	}

	@GetMapping(value = "/employees/demo", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseCreated> demo() {
		return ResponseEntity.ok(new ResponseCreated());
	}
}