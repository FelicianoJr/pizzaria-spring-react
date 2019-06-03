package com.uds.teste.pizzaria.service;

import com.uds.teste.pizzaria.dto.AbstractDTO;
import com.uds.teste.pizzaria.exception.AbstractFindException;
import com.uds.teste.pizzaria.exception.AbstractSaveException;

public interface AbstractService<T extends AbstractDTO, 
S extends AbstractSaveException, 
F extends AbstractFindException> {

	T salvar(T entity) throws S;

	T buscar(Integer id) throws F;

	void atualizar(T entity);
	
}
