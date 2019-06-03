package com.uds.teste.pizzaria.service;

import javax.annotation.PostConstruct;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uds.teste.pizzaria.dto.PedidoDTO;
import com.uds.teste.pizzaria.model.PedidoEntity;

@Service
public class ConverterPedido implements ConverterService<PedidoDTO, PedidoEntity> {

	@Autowired
	private ModelMapper modelMapper;

	@PostConstruct
	public void init() {
		modelMapper.createTypeMap(PedidoDTO.class, PedidoEntity.class);
		modelMapper.createTypeMap(PedidoEntity.class, PedidoDTO.class);
	}

	@Override
	public PedidoEntity entidade(PedidoDTO dto) {
		return modelMapper.map(dto, PedidoEntity.class);
	}

	@Override
	public PedidoDTO dto(PedidoEntity entitdade) {

		return modelMapper.map(entitdade, PedidoDTO.class);
	}

}
