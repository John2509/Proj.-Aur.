package testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pontuacao.*;

class TestePontuacao {

	@Test
	void testeUnsCondicao() {
		Uns uns = new Uns();
		
		boolean resultado = uns.condicaoEValida(null);
		
		assertTrue(resultado);
	}

}
