package com.uds.teste.pizzaria.domain;

public class PizzaGrande implements TamanhoPizza {

	public int tempoPreparo() {
		return 25;
	}

	public double preco() {
		return 40.0;
	}

	public String tamanho() {
		return "Grande";
	}
}
