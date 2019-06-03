package com.uds.teste.pizzaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.uds.teste.pizzaria.domain.PizzariaProvider;
import com.uds.teste.pizzaria.dto.IngredienteAdicionaisDTO;
import com.uds.teste.pizzaria.dto.PedidoDTO;
import com.uds.teste.pizzaria.service.PedidoService;

@RestController
@RequestMapping("/pedido")
public class PedidoController {

	@Autowired
	private PedidoService pedidoServicoImpl;

	@PostMapping(path = "/")
	@ResponseBody
	public PedidoDTO post(@RequestBody final PedidoDTO pedidoDTO) {
		final PedidoDTO pedido = criarPedido(pedidoDTO);
		return pedidoServicoImpl.salvar(pedido);
	}

	private PedidoDTO criarPedido(final PedidoDTO pedidoDTO) {
		final PizzariaProvider pizzariaProvider = new PizzariaProvider(pedidoDTO.getSabor(), pedidoDTO.getTamanho());
		final List<IngredienteAdicionaisDTO> ingredientesAdicionais = pedidoDTO.getIngredientesAdicionais();
		ingredientesAdicionais.forEach(ingrediente -> {
			pizzariaProvider.adicionar(ingrediente.getNome());
		});
		pizzariaProvider.calcularPedido();
		final PedidoDTO pedido = pizzariaProvider.getPedidoDTO();
		return pedido;
	}

	@GetMapping(path = "/{id}")
	@ResponseBody
	public PedidoDTO get(@PathVariable final Integer id) {
		return pedidoServicoImpl.buscar(id);
	}

}
