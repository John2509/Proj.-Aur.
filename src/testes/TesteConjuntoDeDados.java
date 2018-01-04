package testes;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import excecao.NumeroInvalidoException;
import excecao.TamanhoInvalidoException;
import sistema.ConjuntoDeDados;
import sistema.Dado;

class TesteConjuntoDeDados {

	@Test
	void deveriaCriarUmConjuntoComCincoDados() {
		ArrayList<Dado> dados = new ArrayList<>();
		for (int i = 0; i < 5 ; i++) {
			dados.add(new Dado());
		}
		ConjuntoDeDados conjunto = null;
		try {
			conjunto = new ConjuntoDeDados(dados);
		} catch (TamanhoInvalidoException e) {
			fail("Caiu em uma excecao quando nao devia");
		}
		
		assertEquals(5, conjunto.getTamanhoDoConjunto());
	}
	
	@Test
	void deveriaCriarUmConjuntoComQuatroDadosDeSeisFaces() {
		ArrayList<Dado> dados = new ArrayList<>();
		for (int i = 0; i < 2 ; i++) {
			dados.add(new Dado());
		}
		try {
			dados.add(new Dado(3));
		} catch (NumeroInvalidoException e1) {
			fail("Caiu em uma excecao quando nao devia");
		}
		for (int i = 0; i < 2 ; i++) {
			dados.add(new Dado());
		}
		ConjuntoDeDados conjunto = null;
		try {
			conjunto = new ConjuntoDeDados(dados);
		} catch (TamanhoInvalidoException e) {
			fail("Caiu em uma excecao quando nao devia");
		}
		
		assertEquals(4, conjunto.getTamanhoDoConjunto());
		assertEquals(6, conjunto.getNumeroDeLados());
	}
	
	@Test
	void naoDeveriaCriarUmConjuntoVazio() {
		ArrayList<Dado> dados = new ArrayList<>();
		ConjuntoDeDados conjunto = null;
		try {
			conjunto = new ConjuntoDeDados(dados);
			fail("Nao caiu em uma excecao quando devia");
		} catch (Exception e) {
			assertEquals(TamanhoInvalidoException.class, e.getClass());
		}
		
		assertNull(conjunto);
	}
	
	@Test
	void deveriaPegarOsValoresDosDados() throws TamanhoInvalidoException {
		ArrayList<Dado> dados = new ArrayList<>();
		Dado dado0 = new Dado();
		Dado dado1 = new Dado();
		Dado dado2 = new Dado();
		int[] valores = {dado0.rolar(),
						 dado1.rolar(),
						 dado2.rolar()};
		dados.add(dado0);
		dados.add(dado1);
		dados.add(dado2);
		ConjuntoDeDados conjunto = new ConjuntoDeDados(dados);
		
		assertArrayEquals(valores, conjunto.getValores());
	}
	
	@Test
	void deveriaPegarOValoreDeUmDado() throws TamanhoInvalidoException, NumeroInvalidoException {
		ArrayList<Dado> dados = new ArrayList<>();
		Dado dado0 = new Dado();
		Dado dado1 = new Dado();
		Dado dado2 = new Dado();
		int[] valores = {dado0.rolar(),
						 dado1.rolar(),
						 dado2.rolar()};
		dados.add(dado0);
		dados.add(dado1);
		dados.add(dado2);
		ConjuntoDeDados conjunto = new ConjuntoDeDados(dados);
		
		assertEquals(valores[0], conjunto.getValor(0));
		assertEquals(valores[1], conjunto.getValor(1));
		assertEquals(valores[2], conjunto.getValor(2));
	}
	
	@Test
	void deveriaRolarTodosOsDados() throws TamanhoInvalidoException {
		ArrayList<Dado> dados = new ArrayList<>();
		Dado dado0 = new Dado();
		Dado dado1 = new Dado();
		Dado dado2 = new Dado();
		dados.add(dado0);
		dados.add(dado1);
		dados.add(dado2);
		ConjuntoDeDados conjunto = new ConjuntoDeDados(dados);
		
		for (int i = 0; i < 20; i++) {
			int[] numeros = conjunto.rolarTodos();
			assertTrue(1 <= numeros[0] && numeros[0] <= 6);
			assertTrue(1 <= numeros[1] && numeros[1] <= 6);
			assertTrue(1 <= numeros[2] && numeros[2] <= 6);
		}
	}
	
	@Test
	void deveriaRolarUmDado() throws TamanhoInvalidoException, NumeroInvalidoException {
		ArrayList<Dado> dados = new ArrayList<>();
		Dado dado0 = new Dado();
		Dado dado1 = new Dado();
		Dado dado2 = new Dado();
		dados.add(dado0);
		dados.add(dado1);
		dados.add(dado2);
		ConjuntoDeDados conjunto = new ConjuntoDeDados(dados);
		
		int[] numeros = conjunto.rolarTodos();
		int novoNumero = conjunto.rolar(1);
		
		assertEquals(numeros[0], conjunto.getValor(0));
		assertTrue(1 <= novoNumero && novoNumero <= 6);
		assertEquals(numeros[2], conjunto.getValor(2));
	}
	
	@Test
	void deveriaColocarUmValorEmTodosOsDados() throws TamanhoInvalidoException {
		ArrayList<Dado> dados = new ArrayList<>();
		Dado dado0 = new Dado();
		Dado dado1 = new Dado();
		Dado dado2 = new Dado();
		dados.add(dado0);
		dados.add(dado1);
		dados.add(dado2);
		ConjuntoDeDados conjunto = new ConjuntoDeDados(dados);
		
		int[] valores = {2,3,5};
		
		assertEquals(3, conjunto.setValores(valores));
		assertArrayEquals(valores, conjunto.getValores());
	}
	
	@Test
	void naoDeveriaColocarUmValorEmTodosOsDadosValorInvalido() throws TamanhoInvalidoException, NumeroInvalidoException {
		ArrayList<Dado> dados = new ArrayList<>();
		Dado dado0 = new Dado();
		Dado dado1 = new Dado();
		Dado dado2 = new Dado();
		dados.add(dado0);
		dados.add(dado1);
		dados.add(dado2);
		ConjuntoDeDados conjunto = new ConjuntoDeDados(dados);
		
		//Valor invalido
		int valorCerto = dado1.getValor();
		int[] valores1 = {2,-3,5};
		
		assertEquals(2, conjunto.setValores(valores1));
		assertEquals(valores1[0], conjunto.getValor(0));
		assertEquals(valorCerto , conjunto.getValor(1));
		assertEquals(valores1[2], conjunto.getValor(2));
	}
	
	@Test
	void naoDeveriaColocarUmValorEmTodosOsDadosTamanhoMaior() throws TamanhoInvalidoException, NumeroInvalidoException {
		ArrayList<Dado> dados = new ArrayList<>();
		Dado dado0 = new Dado();
		Dado dado1 = new Dado();
		Dado dado2 = new Dado();
		dados.add(dado0);
		dados.add(dado1);
		dados.add(dado2);
		ConjuntoDeDados conjunto = new ConjuntoDeDados(dados);
		
		//Entrada maior que o numero de dados
		int[] valores2 = {2,3,5,3};
		
		assertEquals(3, conjunto.setValores(valores2));
		assertEquals(valores2[0], conjunto.getValor(0));
		assertEquals(valores2[1], conjunto.getValor(1));
		assertEquals(valores2[2], conjunto.getValor(2));
	}
	
	@Test
	void naoDeveriaColocarUmValorEmTodosOsDadosTamanhoMenor() throws TamanhoInvalidoException, NumeroInvalidoException {
		ArrayList<Dado> dados = new ArrayList<>();
		Dado dado0 = new Dado();
		Dado dado1 = new Dado();
		Dado dado2 = new Dado();
		dados.add(dado0);
		dados.add(dado1);
		dados.add(dado2);
		ConjuntoDeDados conjunto = new ConjuntoDeDados(dados);
	
		//Entrada menor que o numero de dados
		int valorCerto = dado2.getValor();
		int[] valores3 = {2,3};
						
		assertEquals(2, conjunto.setValores(valores3));
		assertEquals(valores3[0], conjunto.getValor(0));
		assertEquals(valores3[1], conjunto.getValor(1));
		assertEquals(valorCerto , conjunto.getValor(2));
	}
	
	@Test
	void deveriaColocarOValorEmUmDado() throws TamanhoInvalidoException, NumeroInvalidoException {
		ArrayList<Dado> dados = new ArrayList<>();
		Dado dado0 = new Dado();
		Dado dado1 = new Dado();
		Dado dado2 = new Dado();
		dados.add(dado0);
		dados.add(dado1);
		dados.add(dado2);
		ConjuntoDeDados conjunto = new ConjuntoDeDados(dados);
		int[] valores = conjunto.getValores();
		
		assertTrue(conjunto.setValor(3,1));
		assertEquals(valores[0], conjunto.getValor(0));
		assertEquals(3, conjunto.getValor(1));
		assertEquals(valores[2], conjunto.getValor(2));
	}

}
