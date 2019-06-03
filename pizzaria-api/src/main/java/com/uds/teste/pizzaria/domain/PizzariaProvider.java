package com.uds.teste.pizzaria.domain;

import java.util.HashSet;
import java.util.Set;

import com.uds.teste.pizzaria.dto.IngredienteAdicionaisDTO;
import com.uds.teste.pizzaria.dto.PedidoDTO;

public class PizzariaProvider {

	private double totalPagar;
	private int tempoTotal;

	private Sabor saborPizza;
	private TamanhoPizza tamanhoPizza;
	private Set<Sabor> adicionaisPizza;

	public PizzariaProvider(String sabor, String tamanho) {
		this.adicionaisPizza = new HashSet<>();
		this.saborPizza = new SaborFactory().criar(sabor);
		this.tamanhoPizza = new TamanhoPizzaFactory().criar(tamanho);
	}

	public void calcularPedido() {
		calcularTempo();
		calcularPreco();
		calcularAdicionais();
	}

	public void adicionar(final String sabor) {
		final Sabor ingredienteAdicionais = new SaborFactory().criar(sabor);
		this.adicionaisPizza.add(ingredienteAdicionais);
	}

	private void calcularTempo() {
		this.tempoTotal = this.tamanhoPizza.tempoPreparo() + this.saborPizza.tempoAdicional();
	}

	private void calcularPreco() {
		this.totalPagar += this.tamanhoPizza.preco();
	}

	public PedidoDTO getPedidoDTO() {
		final PedidoDTO pedidoDTO = new PedidoDTO();
		pedidoDTO.setSabor(this.saborPizza.sabor());
		pedidoDTO.setTamanho(this.tamanhoPizza.tamanho());
		pedidoDTO.setTempoPreparo(this.tempoTotal);
		pedidoDTO.setTotal(this.totalPagar);
		adicionaIngredientes(pedidoDTO);
		return pedidoDTO;
	}

	private void adicionaIngredientes(PedidoDTO pedidoDTO) {
		this.adicionaisPizza.forEach(m -> {
			final IngredienteAdicionaisDTO ingredienteAdicionais = new IngredienteAdicionaisDTO();
			ingredienteAdicionais.setNome(m.sabor());
			pedidoDTO.getIngredientesAdicionais().add(ingredienteAdicionais);
		});
	}

	private void calcularAdicionais() {
		if (this.adicionaisPizza != null) {
			this.adicionaisPizza.forEach(adicionais -> {
				this.totalPagar += adicionais.valorAdicional();
			});
		}
	}
}
