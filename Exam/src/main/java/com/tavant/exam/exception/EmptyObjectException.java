package com.tavant.exam.exception;

public class EmptyObjectException extends Exception {

	
	public EmptyObjectException(String msg) {
		super(msg);
		
	}	

	@Override	
		public String toString() {
		
			return super.toString()+ this.getMessage();
	}

}
