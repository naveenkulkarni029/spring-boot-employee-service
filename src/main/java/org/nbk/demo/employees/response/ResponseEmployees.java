package org.nbk.demo.employees.response;

import java.util.List;

import org.nbk.demo.employees.domain.Employee;

public class ResponseEmployees {

	public List<Employee> employeeList;

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("EmployeeList [employeeList=");
		builder.append(employeeList);
		builder.append("]");
		return builder.toString();
	}
}
