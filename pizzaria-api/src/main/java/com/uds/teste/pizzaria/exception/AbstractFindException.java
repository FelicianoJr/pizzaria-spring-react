package com.uds.teste.pizzaria.exception;

public abstract class AbstractFindException extends RuntimeException {
	
	public AbstractFindException(final String message) {
		super("{find exception}" + message);
	}
}
