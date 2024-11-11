package com.student.exception;

public class SillyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private final String message;

    public SillyException(String message) {
        super();
        this.message = message;
}

	public String getMessage() {
		return message;
	}
}
