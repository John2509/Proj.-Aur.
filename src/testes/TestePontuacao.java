package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import pontuacao.*;
import sistema.ConjuntoDeDados;

class TestePontuacao {
	
	@Test
	void testeUnsCondicao() {
		Uns regra = new Uns();
		ConjuntoDeDados MockConjunto1 = Mockito.mock(ConjuntoDeDados.class);
		ConjuntoDeDados MockConjunto2 = Mockito.mock(ConjuntoDeDados.class);
		int[] valores1 = {1,2,3,4,5};
		int[] valores2 = {2,3,4,5,6};
		Mockito.when(MockConjunto1.getValores()).thenReturn(valores1);
		Mockito.when(MockConjunto2.getValores()).thenReturn(valores2);
		
		boolean resultado1 = regra.condicaoEValida(MockConjunto1);
		boolean resultado2 = regra.condicaoEValida(MockConjunto2);
		
		assertTrue(resultado1);
		assertFalse(resultado2);
	}
	
	@Test
	void testeUnsPontuacao() {
		Uns regra = new Uns();
		ConjuntoDeDados MockConjunto = Mockito.mock(ConjuntoDeDados.class);
		int[] valores = {1,2,3,1,5};
		Mockito.when(MockConjunto.getValores()).thenReturn(valores);
		
		int resultado = regra.getPontuacao(MockConjunto);
		
		assertEquals(2, resultado);
	}
	
	@Test
	void testeDoisCondicao() {
		Dois regra = new Dois();
		ConjuntoDeDados MockConjunto1 = Mockito.mock(ConjuntoDeDados.class);
		ConjuntoDeDados MockConjunto2 = Mockito.mock(ConjuntoDeDados.class);
		int[] valores1 = {1,2,3,4,5};
		int[] valores2 = {1,3,4,5,6};
		Mockito.when(MockConjunto1.getValores()).thenReturn(valores1);
		Mockito.when(MockConjunto2.getValores()).thenReturn(valores2);
		
		boolean resultado1 = regra.condicaoEValida(MockConjunto1);
		boolean resultado2 = regra.condicaoEValida(MockConjunto2);
		
		assertTrue(resultado1);
		assertFalse(resultado2);
	}
	
	@Test
	void testeDoisPontuacao() {
		Dois regra = new Dois();
		ConjuntoDeDados MockConjunto = Mockito.mock(ConjuntoDeDados.class);
		int[] valores = {1,2,3,2,5};
		Mockito.when(MockConjunto.getValores()).thenReturn(valores);
		
		int resultado = regra.getPontuacao(MockConjunto);
		
		assertEquals(4, resultado);
	}
	
	@Test
	void testeTresCondicao() {
		Tres regra = new Tres();
		ConjuntoDeDados MockConjunto1 = Mockito.mock(ConjuntoDeDados.class);
		ConjuntoDeDados MockConjunto2 = Mockito.mock(ConjuntoDeDados.class);
		int[] valores1 = {1,2,3,4,5};
		int[] valores2 = {1,2,4,5,6};
		Mockito.when(MockConjunto1.getValores()).thenReturn(valores1);
		Mockito.when(MockConjunto2.getValores()).thenReturn(valores2);
		
		boolean resultado1 = regra.condicaoEValida(MockConjunto1);
		boolean resultado2 = regra.condicaoEValida(MockConjunto2);
		
		assertTrue(resultado1);
		assertFalse(resultado2);
	}
	
	@Test
	void testeTresPontuacao() {
		Tres regra = new Tres();
		ConjuntoDeDados MockConjunto = Mockito.mock(ConjuntoDeDados.class);
		int[] valores = {1,3,3,2,5};
		Mockito.when(MockConjunto.getValores()).thenReturn(valores);
		
		int resultado = regra.getPontuacao(MockConjunto);
		
		assertEquals(6, resultado);
	}
	
	@Test
	void testeQuatrosCondicao() {
		Quatros regra = new Quatros();
		ConjuntoDeDados MockConjunto1 = Mockito.mock(ConjuntoDeDados.class);
		ConjuntoDeDados MockConjunto2 = Mockito.mock(ConjuntoDeDados.class);
		int[] valores1 = {1,2,3,4,5};
		int[] valores2 = {1,2,3,5,6};
		Mockito.when(MockConjunto1.getValores()).thenReturn(valores1);
		Mockito.when(MockConjunto2.getValores()).thenReturn(valores2);
		
		boolean resultado1 = regra.condicaoEValida(MockConjunto1);
		boolean resultado2 = regra.condicaoEValida(MockConjunto2);
		
		assertTrue(resultado1);
		assertFalse(resultado2);
	}
	
	@Test
	void testeQuatrosPontuacao() {
		Quatros regra = new Quatros();
		ConjuntoDeDados MockConjunto = Mockito.mock(ConjuntoDeDados.class);
		int[] valores = {1,4,3,2,4};
		Mockito.when(MockConjunto.getValores()).thenReturn(valores);
		
		int resultado = regra.getPontuacao(MockConjunto);
		
		assertEquals(8, resultado);
	}
	
	@Test
	void testeCincosCondicao() {
		Cincos regra = new Cincos();
		ConjuntoDeDados MockConjunto1 = Mockito.mock(ConjuntoDeDados.class);
		ConjuntoDeDados MockConjunto2 = Mockito.mock(ConjuntoDeDados.class);
		int[] valores1 = {1,2,3,4,5};
		int[] valores2 = {1,2,3,4,6};
		Mockito.when(MockConjunto1.getValores()).thenReturn(valores1);
		Mockito.when(MockConjunto2.getValores()).thenReturn(valores2);
		
		boolean resultado1 = regra.condicaoEValida(MockConjunto1);
		boolean resultado2 = regra.condicaoEValida(MockConjunto2);
		
		assertTrue(resultado1);
		assertFalse(resultado2);
	}
	
	@Test
	void testeCincosPontuacao() {
		Cincos regra = new Cincos();
		ConjuntoDeDados MockConjunto = Mockito.mock(ConjuntoDeDados.class);
		int[] valores = {5,4,5,2,4};
		Mockito.when(MockConjunto.getValores()).thenReturn(valores);
		
		int resultado = regra.getPontuacao(MockConjunto);
		
		assertEquals(10, resultado);
	}
	
	@Test
	void testeSeisCondicao() {
		Seis regra = new Seis();
		ConjuntoDeDados MockConjunto1 = Mockito.mock(ConjuntoDeDados.class);
		ConjuntoDeDados MockConjunto2 = Mockito.mock(ConjuntoDeDados.class);
		int[] valores1 = {1,2,3,4,6};
		int[] valores2 = {1,2,3,4,5};
		Mockito.when(MockConjunto1.getValores()).thenReturn(valores1);
		Mockito.when(MockConjunto2.getValores()).thenReturn(valores2);
		
		boolean resultado1 = regra.condicaoEValida(MockConjunto1);
		boolean resultado2 = regra.condicaoEValida(MockConjunto2);
		
		assertTrue(resultado1);
		assertFalse(resultado2);
	}
	
	@Test
	void testeSeisPontuacao() {
		Seis regra = new Seis();
		ConjuntoDeDados MockConjunto = Mockito.mock(ConjuntoDeDados.class);
		int[] valores = {6,6,5,2,4};
		Mockito.when(MockConjunto.getValores()).thenReturn(valores);
		
		int resultado = regra.getPontuacao(MockConjunto);
		
		assertEquals(12, resultado);
	}
	
	@Test
	void testeAuroraCondicao() {
		Aurora regra = new Aurora();
		ConjuntoDeDados MockConjunto1 = Mockito.mock(ConjuntoDeDados.class);
		ConjuntoDeDados MockConjunto2 = Mockito.mock(ConjuntoDeDados.class);
		int[] valores1 = {1,1,1,1,1};
		int[] valores2 = {1,1,1,1,2};
		Mockito.when(MockConjunto1.getValores()).thenReturn(valores1);
		Mockito.when(MockConjunto2.getValores()).thenReturn(valores2);
		Mockito.when(MockConjunto1.getNumeroDeLados()).thenReturn(6);
		Mockito.when(MockConjunto2.getNumeroDeLados()).thenReturn(6);
		
		boolean resultado1 = regra.condicaoEValida(MockConjunto1);
		boolean resultado2 = regra.condicaoEValida(MockConjunto2);
		
		assertTrue(resultado1);
		assertFalse(resultado2);
	}
	
	@Test
	void testeAuroraPontuacao() {
		Aurora regra = new Aurora();
		ConjuntoDeDados MockConjunto = Mockito.mock(ConjuntoDeDados.class);
		int[] valores = {1,1,1,1,1};
		Mockito.when(MockConjunto.getValores()).thenReturn(valores);
		Mockito.when(MockConjunto.getNumeroDeLados()).thenReturn(6);
		
		int resultado = regra.getPontuacao(MockConjunto);
		
		assertEquals(50, resultado);
	}
	
	@Test
	void testeSequenciaMaiorCondicao() {
		SequenciaMaior regra = new SequenciaMaior();
		ConjuntoDeDados MockConjunto1 = Mockito.mock(ConjuntoDeDados.class);
		ConjuntoDeDados MockConjunto2 = Mockito.mock(ConjuntoDeDados.class);
		int[] valores1 = {1,2,3,4,5};
		int[] valores2 = {1,1,1,1,2};
		Mockito.when(MockConjunto1.getValores()).thenReturn(valores1);
		Mockito.when(MockConjunto2.getValores()).thenReturn(valores2);
		Mockito.when(MockConjunto1.getNumeroDeLados()).thenReturn(6);
		Mockito.when(MockConjunto2.getNumeroDeLados()).thenReturn(6);
		
		boolean resultado1 = regra.condicaoEValida(MockConjunto1);
		boolean resultado2 = regra.condicaoEValida(MockConjunto2);
		
		assertTrue(resultado1);
		assertFalse(resultado2);
	}
	
	@Test
	void testeSequenciaMaiorPontuacao() {
		SequenciaMaior regra = new SequenciaMaior();
		ConjuntoDeDados MockConjunto = Mockito.mock(ConjuntoDeDados.class);
		int[] valores = {6,5,4,3,2};
		Mockito.when(MockConjunto.getValores()).thenReturn(valores);
		Mockito.when(MockConjunto.getNumeroDeLados()).thenReturn(6);
		
		int resultado = regra.getPontuacao(MockConjunto);
		
		assertEquals(20, resultado);
	}
	
	@Test
	void testeSequenciaMenorCondicao() {
		SequenciaMenor regra = new SequenciaMenor();
		ConjuntoDeDados MockConjunto1 = Mockito.mock(ConjuntoDeDados.class);
		ConjuntoDeDados MockConjunto2 = Mockito.mock(ConjuntoDeDados.class);
		int[] valores1 = {6,1,2,3,4};
		int[] valores2 = {1,1,1,1,2};
		Mockito.when(MockConjunto1.getValores()).thenReturn(valores1);
		Mockito.when(MockConjunto2.getValores()).thenReturn(valores2);
		Mockito.when(MockConjunto1.getNumeroDeLados()).thenReturn(6);
		Mockito.when(MockConjunto2.getNumeroDeLados()).thenReturn(6);
		
		boolean resultado1 = regra.condicaoEValida(MockConjunto1);
		boolean resultado2 = regra.condicaoEValida(MockConjunto2);
		
		assertTrue(resultado1);
		assertFalse(resultado2);
	}
	
	@Test
	void testeSequenciaMenorPontuacao() {
		SequenciaMenor regra = new SequenciaMenor();
		ConjuntoDeDados MockConjunto = Mockito.mock(ConjuntoDeDados.class);
		int[] valores = {5,4,3,2,4};
		Mockito.when(MockConjunto.getValores()).thenReturn(valores);
		Mockito.when(MockConjunto.getNumeroDeLados()).thenReturn(6);
		
		int resultado = regra.getPontuacao(MockConjunto);
		
		assertEquals(15, resultado);
	}
	
	@Test
	void testeParCondicao() {
		Par regra = new Par();
		ConjuntoDeDados MockConjunto1 = Mockito.mock(ConjuntoDeDados.class);
		ConjuntoDeDados MockConjunto2 = Mockito.mock(ConjuntoDeDados.class);
		int[] valores1 = {6,1,2,6,4};
		int[] valores2 = {1,3,4,5,2};
		Mockito.when(MockConjunto1.getValores()).thenReturn(valores1);
		Mockito.when(MockConjunto2.getValores()).thenReturn(valores2);
		Mockito.when(MockConjunto1.getNumeroDeLados()).thenReturn(6);
		Mockito.when(MockConjunto2.getNumeroDeLados()).thenReturn(6);
		
		boolean resultado1 = regra.condicaoEValida(MockConjunto1);
		boolean resultado2 = regra.condicaoEValida(MockConjunto2);
		
		assertTrue(resultado1);
		assertFalse(resultado2);
	}
	
	@Test
	void testeParPontuacao() {
		Par regra = new Par();
		ConjuntoDeDados MockConjunto = Mockito.mock(ConjuntoDeDados.class);
		int[] valores = {5,4,3,2,4};
		Mockito.when(MockConjunto.getValores()).thenReturn(valores);
		Mockito.when(MockConjunto.getNumeroDeLados()).thenReturn(6);
		
		int resultado = regra.getPontuacao(MockConjunto);
		
		assertEquals(8, resultado);
	}
	
	@Test
	void testeDoisParesCondicao() {
		DoisPares regra = new DoisPares();
		ConjuntoDeDados MockConjunto1 = Mockito.mock(ConjuntoDeDados.class);
		ConjuntoDeDados MockConjunto2 = Mockito.mock(ConjuntoDeDados.class);
		int[] valores1 = {6,1,4,6,4};
		int[] valores2 = {1,3,4,5,2};
		Mockito.when(MockConjunto1.getValores()).thenReturn(valores1);
		Mockito.when(MockConjunto2.getValores()).thenReturn(valores2);
		Mockito.when(MockConjunto1.getNumeroDeLados()).thenReturn(6);
		Mockito.when(MockConjunto2.getNumeroDeLados()).thenReturn(6);
		
		boolean resultado1 = regra.condicaoEValida(MockConjunto1);
		boolean resultado2 = regra.condicaoEValida(MockConjunto2);
		
		assertTrue(resultado1);
		assertFalse(resultado2);
	}
	
	@Test
	void testeDoisParesPontuacao() {
		DoisPares regra = new DoisPares();
		ConjuntoDeDados MockConjunto = Mockito.mock(ConjuntoDeDados.class);
		int[] valores = {5,4,3,3,4};
		Mockito.when(MockConjunto.getValores()).thenReturn(valores);
		Mockito.when(MockConjunto.getNumeroDeLados()).thenReturn(6);
		
		int resultado = regra.getPontuacao(MockConjunto);
		
		assertEquals(14, resultado);
	}

	@Test
	void testeTrioCondicao() {
		Trio regra = new Trio();
		ConjuntoDeDados MockConjunto1 = Mockito.mock(ConjuntoDeDados.class);
		ConjuntoDeDados MockConjunto2 = Mockito.mock(ConjuntoDeDados.class);
		int[] valores1 = {6,1,6,6,4};
		int[] valores2 = {1,3,4,5,2};
		Mockito.when(MockConjunto1.getValores()).thenReturn(valores1);
		Mockito.when(MockConjunto2.getValores()).thenReturn(valores2);
		Mockito.when(MockConjunto1.getNumeroDeLados()).thenReturn(6);
		Mockito.when(MockConjunto2.getNumeroDeLados()).thenReturn(6);
		
		boolean resultado1 = regra.condicaoEValida(MockConjunto1);
		boolean resultado2 = regra.condicaoEValida(MockConjunto2);
		
		assertTrue(resultado1);
		assertFalse(resultado2);
	}
	
	@Test
	void testeTrioPontuacao() {
		Trio regra = new Trio();
		ConjuntoDeDados MockConjunto = Mockito.mock(ConjuntoDeDados.class);
		int[] valores = {3,4,3,3,1};
		Mockito.when(MockConjunto.getValores()).thenReturn(valores);
		Mockito.when(MockConjunto.getNumeroDeLados()).thenReturn(6);
		
		int resultado = regra.getPontuacao(MockConjunto);
		
		assertEquals(9, resultado);
	}
	
	@Test
	void testeQuadraCondicao() {
		Quadra regra = new Quadra();
		ConjuntoDeDados MockConjunto1 = Mockito.mock(ConjuntoDeDados.class);
		ConjuntoDeDados MockConjunto2 = Mockito.mock(ConjuntoDeDados.class);
		int[] valores1 = {6,6,6,6,4};
		int[] valores2 = {1,3,4,5,2};
		Mockito.when(MockConjunto1.getValores()).thenReturn(valores1);
		Mockito.when(MockConjunto2.getValores()).thenReturn(valores2);
		Mockito.when(MockConjunto1.getNumeroDeLados()).thenReturn(6);
		Mockito.when(MockConjunto2.getNumeroDeLados()).thenReturn(6);
		
		boolean resultado1 = regra.condicaoEValida(MockConjunto1);
		boolean resultado2 = regra.condicaoEValida(MockConjunto2);
		
		assertTrue(resultado1);
		assertFalse(resultado2);
	}
	
	@Test
	void testeQuadraPontuacao() {
		Quadra regra = new Quadra();
		ConjuntoDeDados MockConjunto = Mockito.mock(ConjuntoDeDados.class);
		int[] valores = {3,4,3,3,3};
		Mockito.when(MockConjunto.getValores()).thenReturn(valores);
		Mockito.when(MockConjunto.getNumeroDeLados()).thenReturn(6);
		
		int resultado = regra.getPontuacao(MockConjunto);
		
		assertEquals(12, resultado);
	}
	
	@Test
	void testeFullHouseCondicao() {
		FullHouse regra = new FullHouse();
		ConjuntoDeDados MockConjunto1 = Mockito.mock(ConjuntoDeDados.class);
		ConjuntoDeDados MockConjunto2 = Mockito.mock(ConjuntoDeDados.class);
		int[] valores1 = {6,4,6,6,4};
		int[] valores2 = {1,3,4,5,2};
		Mockito.when(MockConjunto1.getValores()).thenReturn(valores1);
		Mockito.when(MockConjunto2.getValores()).thenReturn(valores2);
		Mockito.when(MockConjunto1.getNumeroDeLados()).thenReturn(6);
		Mockito.when(MockConjunto2.getNumeroDeLados()).thenReturn(6);
		
		boolean resultado1 = regra.condicaoEValida(MockConjunto1);
		boolean resultado2 = regra.condicaoEValida(MockConjunto2);
		
		assertTrue(resultado1);
		assertFalse(resultado2);
	}
	
	@Test
	void testeFullHousePontuacao() {
		FullHouse regra = new FullHouse();
		ConjuntoDeDados MockConjunto = Mockito.mock(ConjuntoDeDados.class);
		int[] valores = {3,4,3,4,3};
		Mockito.when(MockConjunto.getValores()).thenReturn(valores);
		Mockito.when(MockConjunto.getNumeroDeLados()).thenReturn(6);
		
		int resultado = regra.getPontuacao(MockConjunto);
		
		assertEquals(17, resultado);
	}
}
