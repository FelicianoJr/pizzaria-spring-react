package com.uds.teste.pizzaria.model;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Id;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity(name = "tb_pedido")
public class PedidoEntity extends AbstractEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "pedido_gen", sequenceName = "pedido_seq")
	private Integer Id;

	private String tamanho;

	private String Sabor;

	private Double total;

	private Integer tempoPreparo;

	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private Set<IngredientesAdicionaisEntity> ingredientesAdicionais;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
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

	public Set<IngredientesAdicionaisEntity> getIngredientesAdicionais() {
		if (ingredientesAdicionais == null) {
			ingredientesAdicionais = new HashSet<>();
		}
		return ingredientesAdicionais;
	}

	public void setIngredientesAdicionais(Set<IngredientesAdicionaisEntity> ingredientesAdicionais) {
		this.ingredientesAdicionais = ingredientesAdicionais;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		result = prime * result + ((Sabor == null) ? 0 : Sabor.hashCode());
		result = prime * result + ((ingredientesAdicionais == null) ? 0 : ingredientesAdicionais.hashCode());
		result = prime * result + ((tamanho == null) ? 0 : tamanho.hashCode());
		result = prime * result + ((tempoPreparo == null) ? 0 : tempoPreparo.hashCode());
		result = prime * result + ((total == null) ? 0 : total.hashCode());
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
		PedidoEntity other = (PedidoEntity) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		if (Sabor == null) {
			if (other.Sabor != null)
				return false;
		} else if (!Sabor.equals(other.Sabor))
			return false;
		if (ingredientesAdicionais == null) {
			if (other.ingredientesAdicionais != null)
				return false;
		} else if (!ingredientesAdicionais.equals(other.ingredientesAdicionais))
			return false;
		if (tamanho == null) {
			if (other.tamanho != null)
				return false;
		} else if (!tamanho.equals(other.tamanho))
			return false;
		if (tempoPreparo == null) {
			if (other.tempoPreparo != null)
				return false;
		} else if (!tempoPreparo.equals(other.tempoPreparo))
			return false;
		if (total == null) {
			if (other.total != null)
				return false;
		} else if (!total.equals(other.total))
			return false;
		return true;
	}

}
