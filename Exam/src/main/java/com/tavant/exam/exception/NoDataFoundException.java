package com.tavant.exam.exception;

public class NoDataFoundException extends Exception {
	
	public NoDataFoundException (String msg) {
		super(msg);
	}
	
	@Override	
	public String toString() {
	
		return super.toString()+ this.getMessage();
	}
}
