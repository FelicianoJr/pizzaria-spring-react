package com.uds.teste.pizzaria.domain;

public class PizzaMedia implements TamanhoPizza{
	
	public int tempoPreparo() {
		return 20;
	}

	public double preco() {
		return 30.0;
	}

	public String tamanho() {
		return "Media";
	}

}
