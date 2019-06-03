package com.uds.teste.pizzaria.service;

import com.uds.teste.pizzaria.dto.AbstractDTO;
import com.uds.teste.pizzaria.model.AbstractEntity;

public interface ConverterService<D extends AbstractDTO, E extends AbstractEntity> {
	E entidade(D dto);

	D dto(E entity);
}
