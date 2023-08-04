package com.conversor.exceptions;


public class ValorNoVálidoException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public ValorNoVálidoException(String msg) {
		super(msg);
	}
}
