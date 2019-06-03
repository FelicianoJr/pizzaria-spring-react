package com.uds.teste.pizzaria.service;

import com.uds.teste.pizzaria.dto.PedidoDTO;
import com.uds.teste.pizzaria.exception.PedidoFindException;
import com.uds.teste.pizzaria.exception.PedidoSaveException;

public interface PedidoService extends AbstractService<PedidoDTO, PedidoSaveException, PedidoFindException> {

}
