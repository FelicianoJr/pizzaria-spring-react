package com.uds.teste.pizzaria.dto;

public class IngredienteAdicionaisDTO extends AbstractDTO {

	private Integer Id;
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}
	
	
}
