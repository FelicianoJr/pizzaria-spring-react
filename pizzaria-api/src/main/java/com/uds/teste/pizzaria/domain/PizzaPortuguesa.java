package com.uds.teste.pizzaria.domain;

public class PizzaPortuguesa implements Sabor{
	
	@Override
	public String sabor() {
		return "Portuguesa";
	}

	@Override
	public int tempoAdicional() {
		return 5;
	}

	@Override
	public double valorAdicional() {
		return 0;
	}
}
