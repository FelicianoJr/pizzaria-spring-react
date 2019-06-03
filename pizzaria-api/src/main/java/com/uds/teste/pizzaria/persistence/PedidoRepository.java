package com.uds.teste.pizzaria.persistence;

import org.springframework.data.repository.CrudRepository;

import com.uds.teste.pizzaria.model.PedidoEntity;

public interface PedidoRepository extends CrudRepository<PedidoEntity, Integer> {
}
