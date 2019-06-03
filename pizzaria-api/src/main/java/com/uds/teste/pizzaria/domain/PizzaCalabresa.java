package com.uds.teste.pizzaria.domain;

public class PizzaCalabresa implements Sabor {

	@Override
	public String sabor() {
		return "Calabresa";
	}

	@Override
	public int tempoAdicional() {
		return 0;
	}

	@Override
	public double valorAdicional() {
		return 0;
	}

}
