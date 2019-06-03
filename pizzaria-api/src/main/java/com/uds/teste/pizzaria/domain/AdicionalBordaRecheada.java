package com.uds.teste.pizzaria.domain;

public class AdicionalBordaRecheada implements Sabor {
	private String ingrediente = "Borda Recheada";

	@Override
	public String sabor() {
		return ingrediente;
	}

	@Override
	public int tempoAdicional() {
		return 5;
	}

	@Override
	public double valorAdicional() {
		return 5.00;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ingrediente == null) ? 0 : ingrediente.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AdicionalBordaRecheada other = (AdicionalBordaRecheada) obj;
		if (ingrediente == null) {
			if (other.ingrediente != null)
				return false;
		} else if (!ingrediente.equals(other.ingrediente))
			return false;
		return true;
	}

}
