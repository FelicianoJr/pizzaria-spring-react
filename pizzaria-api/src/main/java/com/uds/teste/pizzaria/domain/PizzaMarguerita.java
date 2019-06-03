package com.uds.teste.pizzaria.domain;

public class PizzaMarguerita implements Sabor {

	@Override
	public String sabor() {
		return "Marguerita";
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
