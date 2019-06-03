package com.uds.teste.pizzaria.domain;

public class PizzaPequena implements TamanhoPizza {
	
	public int tempoPreparo() {
		return 20;
	}

	public double preco() {
		return 20.0;
	}

	public String tamanho() {
		return "Pequena";
	}
}
