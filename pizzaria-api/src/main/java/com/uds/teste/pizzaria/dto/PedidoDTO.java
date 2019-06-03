package com.uds.teste.pizzaria.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class PedidoDTO extends AbstractDTO {

	private Integer Id;
	
	private String tamanho;

	private String Sabor;

	private Double total;

	private Integer tempoPreparo;

	private List<IngredienteAdicionaisDTO> ingredientesAdicionais;

	public PedidoDTO() {
		ingredientesAdicionais = new ArrayList<IngredienteAdicionaisDTO>();
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getSabor() {
		return Sabor;
	}

	public void setSabor(String sabor) {
		Sabor = sabor;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	public Integer getTempoPreparo() {
		return tempoPreparo;
	}

	public void setTempoPreparo(Integer tempoPreparo) {
		this.tempoPreparo = tempoPreparo;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		this.Id = id;
	}

	public List<IngredienteAdicionaisDTO> getIngredientesAdicionais() {
		return ingredientesAdicionais;
	}

	public void setIngredientesAdicionais(List<IngredienteAdicionaisDTO> ingredienteAdicionaisDTO) {
		this.ingredientesAdicionais = ingredienteAdicionaisDTO;
	}

	

}
