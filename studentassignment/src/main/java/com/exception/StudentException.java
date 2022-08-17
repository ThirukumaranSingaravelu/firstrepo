package com.exception;

public class StudentException extends Exception {
	private String errorMessage;

	public StudentException(String errorMessage) {
		super();
		this.errorMessage = errorMessage;
	}

	public StudentException() {
		super();
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public String getMessage() {
		return this.getMessage();
	}
	

	
}
