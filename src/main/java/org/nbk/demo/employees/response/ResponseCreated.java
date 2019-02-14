package org.nbk.demo.employees.response;

public class ResponseCreated {

	private String messageSuccess="Created SuccessFully";

	public String getMessageSuccess() {
		return messageSuccess;
	}

	public void setMessageSuccess(String messageSuccess) {
		this.messageSuccess = messageSuccess;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ResponseCreated [messageSuccess=");
		builder.append(messageSuccess);
		builder.append("]");
		return builder.toString();
	}
}