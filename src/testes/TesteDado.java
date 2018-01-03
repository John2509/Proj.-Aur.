package testes;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import excecao.NumeroInvalidoException;
import sistema.Dado;

class TesteDado {

	@Test
	void deveriaCriarUmDadoDeSeisLados() {
		Dado dado = null;
		try {
			dado = new Dado(4);
		} catch (NumeroInvalidoException e) {
			fail("Caiu em uma excecao quando nao devia");
		}
		
		assertEquals(6, dado.getLados());
	}
	
	@Test
	void nãoDeveriaCriarUmDadoDeMenosDoisLados() {
		Dado dado = null;
		
		try {
			dado = new Dado(-2);
			fail("Nao caiu em uma excecao quando devia");
		} catch (Exception e) {
			assertEquals(NumeroInvalidoException.class, e.getClass());
		}
		
		assertNull(dado);
	}
	
	@Test
	void deveriaRolarValoresValidosNoDado() throws NumeroInvalidoException {
		Dado dado = new Dado();
		
		for (int i = 0; i < 20; i++) {
			int numero = dado.rolar();
			assertTrue("Dado esta fora do limite: " + numero, 1 <= numero && numero <= 6);
		}
	}
	
	@Test
	void deveriaPegarOValorQueRoladoPelaUltimaVezNoDado() throws NumeroInvalidoException {
		Dado dado = new Dado();
		int esperado = dado.rolar();
		
		assertEquals(esperado, dado.getValor());
	}
	
	@Test
	void deveriaColocarUmValorValidoNoDado() throws NumeroInvalidoException {
		Dado dado = new Dado();
		dado.setValor(3);
		
		assertEquals(3, dado.getValor());
		
		dado.setValor(6);
		
		assertEquals(6, dado.getValor());
		
		dado.setValor(1);
		
		assertEquals(1, dado.getValor());
	}
	
	@Test
	void naoDeveriaColocarUmValorInvalidoNoDado() throws NumeroInvalidoException {
		Dado dado = new Dado();
		int esperado = dado.rolar();
		
		assertThrows(NumeroInvalidoException.class, ()->{
			dado.setValor(-3);
		});
		
		assertThrows(NumeroInvalidoException.class, ()->{
			dado.setValor(8);
		});
		
		assertEquals(esperado, dado.getValor());
	}

}
