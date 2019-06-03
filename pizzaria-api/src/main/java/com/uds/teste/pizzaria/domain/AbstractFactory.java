package com.uds.teste.pizzaria.domain;

public interface AbstractFactory<T> {
	T criar(String sabor);
}
