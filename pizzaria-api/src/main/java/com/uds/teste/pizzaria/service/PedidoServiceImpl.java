package com.uds.teste.pizzaria.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uds.teste.pizzaria.dto.IngredienteAdicionaisDTO;
import com.uds.teste.pizzaria.dto.PedidoDTO;
import com.uds.teste.pizzaria.exception.PedidoFindException;
import com.uds.teste.pizzaria.exception.PedidoSaveException;
import com.uds.teste.pizzaria.model.IngredientesAdicionaisEntity;
import com.uds.teste.pizzaria.model.PedidoEntity;
import com.uds.teste.pizzaria.persistence.PedidoRepository;

@Service
public class PedidoServiceImpl implements PedidoService {

	@Autowired
	PedidoRepository pedidoRepository;

	@Autowired
	private ConverterService<PedidoDTO, PedidoEntity> converterPedido;

	@Autowired
	private ConverterService<IngredienteAdicionaisDTO, IngredientesAdicionaisEntity> converterIngrediente;

	@Override
	public PedidoDTO salvar(PedidoDTO pedidoDTO) throws PedidoSaveException {
		final PedidoEntity pedido = converterPedido.entidade(pedidoDTO);
		pedidoDTO.getIngredientesAdicionais().forEach(m -> {
			final IngredientesAdicionaisEntity ingre = converterIngrediente.entidade(m);
			pedido.getIngredientesAdicionais().add(ingre);
		});
		final PedidoEntity ped = pedidoRepository.save(pedido);
		return converterPedido.dto(ped);
	}

	@Override
	public PedidoDTO buscar(Integer id) throws PedidoFindException {
		final Optional<PedidoEntity> optional = pedidoRepository.findById(id);
		final PedidoEntity pedido = optional.get();
		final PedidoDTO pedidoDTO = converterPedido.dto(pedido);
		return pedidoDTO;
	}

	@Override
	public void atualizar(PedidoDTO pedidoDTO) {
		final PedidoEntity pedido = converterPedido.entidade(pedidoDTO);
		pedidoRepository.save(pedido);
	}
}
