package com.uds.teste.pizzaria.domain;

public class TamanhoPizzaFactory implements AbstractFactory<TamanhoPizza> {

	@Override
	public TamanhoPizza criar(String sabor) {
		if (sabor.equalsIgnoreCase("Grande")) {
			return new PizzaGrande();
		}
		if (sabor.equalsIgnoreCase("Media")) {
			return new PizzaMedia();
		}
		if (sabor.equalsIgnoreCase("Pequena")) {
			return new PizzaPequena();
		}
		return null;
	}

}
