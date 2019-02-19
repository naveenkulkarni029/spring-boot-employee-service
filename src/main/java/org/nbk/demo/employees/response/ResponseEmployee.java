package org.nbk.demo.employees.response;

public class ResponseEmployee {
	private String employeeName;

	private int employeeAge;

	private String employeeEmail;

	private String phoneNumber;
	
	private ResponseAddress responseAddress;

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getEmployeeAge() {
		return employeeAge;
	}

	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public ResponseAddress getResponseAddress() {
		return responseAddress;
	}

	public void setResponseAddress(ResponseAddress responseAddress) {
		this.responseAddress = responseAddress;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ResponseEmployee [employeeName=");
		builder.append(employeeName);
		builder.append(", employeeAge=");
		builder.append(employeeAge);
		builder.append(", employeeEmail=");
		builder.append(employeeEmail);
		builder.append(", phoneNumber=");
		builder.append(phoneNumber);
		builder.append(", responseAddress=");
		builder.append(responseAddress);
		builder.append("]");
		return builder.toString();
	}

	
}
