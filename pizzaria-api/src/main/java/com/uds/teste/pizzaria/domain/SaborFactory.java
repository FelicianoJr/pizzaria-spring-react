package com.uds.teste.pizzaria.domain;

public class SaborFactory implements AbstractFactory<Sabor> {

	@Override
	public Sabor criar(String sabor) {
		if (sabor.equalsIgnoreCase("Calabresa")) {
			return new PizzaCalabresa();
		}
		if (sabor.equalsIgnoreCase("Marguerita")) {
			return new PizzaMarguerita();
		}
		if (sabor.equalsIgnoreCase("Portuguesa")) {
			return new PizzaPortuguesa();
		}
		if (sabor.equalsIgnoreCase("Extra bacon")) {
			return new AdicionalExtraBacon();
		}
		if (sabor.equalsIgnoreCase("Sem cebola")) {
			return new AdicionalSemCebola();
		}
		if (sabor.equalsIgnoreCase("Borda recheada")) {
			return new AdicionalBordaRecheada();
		}
		return null;
	}

}
