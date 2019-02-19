package org.nbk.demo.employees.service;

import java.util.List;

import org.nbk.demo.employees.domain.Employee;
import org.nbk.demo.employees.repository.EmployeesRepository;
import org.nbk.demo.employees.response.ResponseAddress;
import org.nbk.demo.employees.response.ResponseEmployee;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeesServiceImpl implements EmployeesService{

	@Autowired
	private EmployeesRepository employeesRepository;

	@Override
	public void save(Employee employee) {
		employeesRepository.save(employee);
		
	}

	@Override
	public ResponseEmployee get(String employeeEmail) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
	      HttpEntity <ResponseAddress> entity = new HttpEntity<ResponseAddress>(headers);
		Employee employee = employeesRepository.get(employeeEmail);
		ResponseEmployee responseEmployee = new ResponseEmployee();
		BeanUtils.copyProperties(employee, responseEmployee);
		RestTemplate restTemplate = new RestTemplate(); 
		String url = "http://localhost:8090/employees/address/get/"+employee.getEmployeeEmail();
		try {
		ResponseEntity<ResponseAddress> responseAddress = restTemplate.exchange(url, HttpMethod.POST, entity, ResponseAddress.class);
		responseEmployee.setResponseAddress(responseAddress.getBody());
		}catch(Exception ex) {
			if(ex instanceof HttpClientErrorException) {
				System.out.println("client error");
			}
			if(ex instanceof HttpServerErrorException) {
				System.out.println("server error");
			}
			if(ex instanceof HttpRequestMethodNotSupportedException) {
				System.out.println("method not supported error");
			}
		}
		return responseEmployee;
	}

	@Override
	public List<Employee> list() {
		return employeesRepository.list();
	}
	
}