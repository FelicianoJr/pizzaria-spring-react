package com.uds.teste.pizzaria.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.uds.teste.pizzaria.dto.PedidoDTO;

public class PizzariaTest {

	private static final String EXTRA_BACON = "extra bacon";
	private static final String SEM_CEBOLA = "sem cebola";
	private static final String BORDA_RECHEADA = "borda recheada";

	private static final String GRANDE = "grande";
	private static final String MEDIA = "media";
	private static final String PEQUENA = "pequena";

	private static final String CALABRESA = "calabresa";
	private static final String PORTUGUESA = "portuguesa";
	private static final String MARGUERITA = "marguerita";

	@Test
	public void test_pizza_calabresa_grande_com_todos_adicionais() {

		final PizzariaProvider pizzariaProvider = new PizzariaProvider(CALABRESA, GRANDE);
		pizzariaProvider.adicionar(EXTRA_BACON);
		pizzariaProvider.adicionar(SEM_CEBOLA);
		pizzariaProvider.adicionar(BORDA_RECHEADA);
		pizzariaProvider.calcularPedido();
		final PedidoDTO pedidoDTO = pizzariaProvider.getPedidoDTO();

		assertEquals(48.0, pedidoDTO.getTotal(), 0);
		assertEquals(25, pedidoDTO.getTempoPreparo(), 0);
	}

	@Test
	public void test_pizza_calabresa_media_com_todos_adicionais() {
		final PizzariaProvider pizzariaProvider = new PizzariaProvider(CALABRESA, MEDIA);
		pizzariaProvider.adicionar(EXTRA_BACON);
		pizzariaProvider.adicionar(SEM_CEBOLA);
		pizzariaProvider.adicionar(BORDA_RECHEADA);
		pizzariaProvider.calcularPedido();
		final PedidoDTO pedidoDTO = pizzariaProvider.getPedidoDTO();

		assertEquals(38.0, pedidoDTO.getTotal(), 0);
		assertEquals(20, pedidoDTO.getTempoPreparo(), 0);
	}

	@Test
	public void test_pizza_calabresa_pequena_com_todos_adicionais() {
		final PizzariaProvider pizzariaProvider = new PizzariaProvider(CALABRESA, PEQUENA);
		pizzariaProvider.adicionar(EXTRA_BACON);
		pizzariaProvider.adicionar(SEM_CEBOLA);
		pizzariaProvider.adicionar(BORDA_RECHEADA);
		pizzariaProvider.calcularPedido();
		final PedidoDTO pedidoDTO = pizzariaProvider.getPedidoDTO();

		assertEquals(28.0, pedidoDTO.getTotal(), 0);
		assertEquals(20, pedidoDTO.getTempoPreparo(), 0);
	}

	@Test
	public void test_pizza_marguerita_grande_com_todos_adicionais() {

		final PizzariaProvider pizzariaProvider = new PizzariaProvider(MARGUERITA, GRANDE);
		pizzariaProvider.adicionar(EXTRA_BACON);
		pizzariaProvider.adicionar(SEM_CEBOLA);
		pizzariaProvider.adicionar(BORDA_RECHEADA);
		pizzariaProvider.calcularPedido();
		final PedidoDTO pedidoDTO = pizzariaProvider.getPedidoDTO();

		assertEquals(48.0, pedidoDTO.getTotal(), 0);
		assertEquals(25, pedidoDTO.getTempoPreparo(), 0);
	}

	@Test
	public void test_pizza_marguerita_media_com_todos_adicionais() {
		final PizzariaProvider pizzariaProvider = new PizzariaProvider(MARGUERITA, MEDIA);
		pizzariaProvider.adicionar(EXTRA_BACON);
		pizzariaProvider.adicionar(SEM_CEBOLA);
		pizzariaProvider.adicionar(BORDA_RECHEADA);
		pizzariaProvider.calcularPedido();
		final PedidoDTO pedidoDTO = pizzariaProvider.getPedidoDTO();

		assertEquals(38.0, pedidoDTO.getTotal(), 0);
		assertEquals(20, pedidoDTO.getTempoPreparo(), 0);

	}

	@Test
	public void test_pizza_marguerita_pequena_com_todos_adicionais() {

		final PizzariaProvider pizzariaProvider = new PizzariaProvider(MARGUERITA, PEQUENA);
		pizzariaProvider.adicionar(EXTRA_BACON);
		pizzariaProvider.adicionar(SEM_CEBOLA);
		pizzariaProvider.adicionar(BORDA_RECHEADA);
		pizzariaProvider.calcularPedido();
		final PedidoDTO pedidoDTO = pizzariaProvider.getPedidoDTO();

		assertEquals(28.0, pedidoDTO.getTotal(), 0);
		assertEquals(20, pedidoDTO.getTempoPreparo(), 0);

	}

	@Test
	public void test_pizza_portuguesa_grande_com_todos_adicionais() {
		final PizzariaProvider pizzariaProvider = new PizzariaProvider(PORTUGUESA, GRANDE);
		pizzariaProvider.adicionar(EXTRA_BACON);
		pizzariaProvider.adicionar(SEM_CEBOLA);
		pizzariaProvider.adicionar(BORDA_RECHEADA);
		pizzariaProvider.calcularPedido();
		final PedidoDTO pedidoDTO = pizzariaProvider.getPedidoDTO();

		assertEquals(48.0, pedidoDTO.getTotal(), 0);
		assertEquals(30, pedidoDTO.getTempoPreparo(), 0);

	}

	@Test
	public void test_pizza_portuguesa_media_com_todos_adicionais() {
		final PizzariaProvider pizzariaProvider = new PizzariaProvider(PORTUGUESA, MEDIA);
		pizzariaProvider.adicionar(EXTRA_BACON);
		pizzariaProvider.adicionar(SEM_CEBOLA);
		pizzariaProvider.adicionar(BORDA_RECHEADA);
		pizzariaProvider.calcularPedido();
		final PedidoDTO pedidoDTO = pizzariaProvider.getPedidoDTO();

		assertEquals(38.0, pedidoDTO.getTotal(), 0);
		assertEquals(25, pedidoDTO.getTempoPreparo(), 0);

	}

	@Test
	public void test_pizza_portuguesa_pequena_com_todos_adicionais() {
		final PizzariaProvider pizzariaProvider = new PizzariaProvider(PORTUGUESA, PEQUENA);
		pizzariaProvider.adicionar(EXTRA_BACON);
		pizzariaProvider.adicionar(SEM_CEBOLA);
		pizzariaProvider.adicionar(BORDA_RECHEADA);
		pizzariaProvider.calcularPedido();
		final PedidoDTO pedidoDTO = pizzariaProvider.getPedidoDTO();

		assertEquals(28.0, pedidoDTO.getTotal(), 0);
		assertEquals(25, pedidoDTO.getTempoPreparo(), 0);

	}

	@Test
	public void test_pizza_calabresa_grande_sem_adicionais() {
		final PizzariaProvider pizzariaProvider = new PizzariaProvider(CALABRESA, GRANDE);
		pizzariaProvider.calcularPedido();
		final PedidoDTO pedidoDTO = pizzariaProvider.getPedidoDTO();

		assertEquals(40.0, pedidoDTO.getTotal(), 0);
		assertEquals(25, pedidoDTO.getTempoPreparo(), 0);
	}

	@Test
	public void test_pizza_marguerita_grande_sem_adicionais() {
		final PizzariaProvider pizzariaProvider = new PizzariaProvider(MARGUERITA, GRANDE);
		pizzariaProvider.calcularPedido();
		final PedidoDTO pedidoDTO = pizzariaProvider.getPedidoDTO();

		assertEquals(40.0, pedidoDTO.getTotal(), 0);
		assertEquals(25, pedidoDTO.getTempoPreparo(), 0);
	}

	@Test
	public void test_pizza_portuguesa_grande_sem_adicionais() {
		final PizzariaProvider pizzariaProvider = new PizzariaProvider(PORTUGUESA, GRANDE);
		pizzariaProvider.calcularPedido();
		final PedidoDTO pedidoDTO = pizzariaProvider.getPedidoDTO();

		assertEquals(40.0, pedidoDTO.getTotal(), 0);
		assertEquals(30, pedidoDTO.getTempoPreparo(), 0);

	}

	@Test
	public void test_pizza_calabresa_grande_com_muitos_adicionais_repetidos() {
		final PizzariaProvider pizzariaProvider = new PizzariaProvider(CALABRESA, GRANDE);
		pizzariaProvider.adicionar(EXTRA_BACON);
		pizzariaProvider.adicionar(SEM_CEBOLA);
		pizzariaProvider.adicionar(BORDA_RECHEADA);
		pizzariaProvider.adicionar(BORDA_RECHEADA);
		pizzariaProvider.adicionar(BORDA_RECHEADA);
		pizzariaProvider.adicionar(BORDA_RECHEADA);
		pizzariaProvider.calcularPedido();
		final PedidoDTO pedidoDTO = pizzariaProvider.getPedidoDTO();


		assertEquals(48.0, pedidoDTO.getTotal(), 0);
		assertEquals(25, pedidoDTO.getTempoPreparo(), 0);
	}

}
