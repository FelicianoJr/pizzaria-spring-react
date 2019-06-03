package com.uds.teste.pizzaria.service;

import javax.annotation.PostConstruct;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uds.teste.pizzaria.dto.IngredienteAdicionaisDTO;
import com.uds.teste.pizzaria.model.IngredientesAdicionaisEntity;

@Service
public class ConverterIngrediente implements ConverterService<IngredienteAdicionaisDTO, IngredientesAdicionaisEntity> {

	@Autowired
	private ModelMapper modelMapper;

	@PostConstruct
	public void init() {
		modelMapper.createTypeMap(IngredienteAdicionaisDTO.class, IngredientesAdicionaisEntity.class);
		modelMapper.createTypeMap(IngredientesAdicionaisEntity.class, IngredienteAdicionaisDTO.class);
	}

	@Override
	public IngredientesAdicionaisEntity entidade(IngredienteAdicionaisDTO dto) {
		return modelMapper.map(dto, IngredientesAdicionaisEntity.class);
	}

	@Override
	public IngredienteAdicionaisDTO dto(IngredientesAdicionaisEntity entitdade) {
		return modelMapper.map(entitdade, IngredienteAdicionaisDTO.class);
	}

}
