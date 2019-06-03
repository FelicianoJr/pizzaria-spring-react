package com.uds.teste.pizzaria.exception;

public abstract class AbstractSaveException extends RuntimeException {

	public AbstractSaveException(final String message) {
		super("{save exception}" + message);
	}
}
