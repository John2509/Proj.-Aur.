package testes;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import excecao.TamanhoInvalidoException;
import pontuacao.*;
import sistema.ConjuntoDeDados;
import sistema.ConjuntoDePontuacoes;

class TesteConjuntoDePontuacoes {

	@Test
	void deveriaCriarUmConjuntoComSeisRegrasAtivas() {
		ArrayList<Pontuacao> regras = new ArrayList<>();
		regras.add(new Uns());
		regras.add(new Dois());
		regras.add(new Tres());
		regras.add(new Quatros());
		regras.add(new Cincos());
		regras.add(new Seis());
		
		ConjuntoDePontuacoes conjunto = null;
		try {
			conjunto = new ConjuntoDePontuacoes(regras);
		} catch (TamanhoInvalidoException e) {
			fail("Caiu em uma excecao quando nao devia");
		}
		
		assertEquals(6, conjunto.getNumeroDeRegrasAtivas());
		assertEquals(0, conjunto.getNumeroDeRegrasNaoAtivas());
	}
	
	@Test
	void deveriaCriarUmConjuntoComQuatroRegrasAtivasEDuasNaoAtivas() {
		ArrayList<Pontuacao> regras = new ArrayList<>();
		regras.add(new Uns());
		Pontuacao dois = new Dois();
		dois.setAtivo(false);
		regras.add(dois);
		regras.add(new Tres());
		regras.add(new Quatros());
		Pontuacao cinco = new Cincos();
		cinco.setAtivo(false);
		regras.add(cinco);
		regras.add(new Seis());
		
		ConjuntoDePontuacoes conjunto = null;
		try {
			conjunto = new ConjuntoDePontuacoes(regras);
		} catch (TamanhoInvalidoException e) {
			fail("Caiu em uma excecao quando nao devia");
		}
		
		assertEquals(4, conjunto.getNumeroDeRegrasAtivas());
		assertEquals(2, conjunto.getNumeroDeRegrasNaoAtivas());
	}
	
	@Test
	void naoDeveriaCriarUmConjuntoVazio() {
		ArrayList<Pontuacao> regras = new ArrayList<>();
		
		ConjuntoDePontuacoes conjunto = null;
		try {
			conjunto = new ConjuntoDePontuacoes(regras);
			fail("Nao caiu em uma excecao quando devia");
		} catch (Exception e) {
			assertEquals(TamanhoInvalidoException.class, e.getClass());
		}
		
		assertNull(conjunto);
	}
	
	@Test
	void deveriaAdicionarUmaNovaRegraAtivaAoConjunto() throws TamanhoInvalidoException {
		ArrayList<Pontuacao> regras = new ArrayList<>();
		regras.add(new Uns());
		regras.add(new Dois());
		regras.add(new Tres());
		regras.add(new Quatros());
		regras.add(new Cincos());
		ConjuntoDePontuacoes conjunto = new ConjuntoDePontuacoes(regras);
		
		conjunto.adicionar(new Seis());
		
		assertEquals(6, conjunto.getNumeroDeRegrasAtivas());
		assertEquals(0, conjunto.getNumeroDeRegrasNaoAtivas());
	}
	
	@Test
	void deveriaAdicionarUmaNovaRegraNaoAtivaAoConjunto() throws TamanhoInvalidoException {
		ArrayList<Pontuacao> regras = new ArrayList<>();
		regras.add(new Uns());
		Pontuacao dois = new Dois();
		dois.setAtivo(false);
		regras.add(dois);
		regras.add(new Tres());
		regras.add(new Quatros());
		regras.add(new Cincos());
		ConjuntoDePontuacoes conjunto = new ConjuntoDePontuacoes(regras);
		
		Pontuacao seis = new Seis();
		seis.setAtivo(false);
		conjunto.adicionar(seis);
		
		assertEquals(4, conjunto.getNumeroDeRegrasAtivas());
		assertEquals(2, conjunto.getNumeroDeRegrasNaoAtivas());
	}
	
	@Test
	void deveriaRetornarUmaListaDasRegrasAtivas() throws TamanhoInvalidoException {
		ArrayList<Pontuacao> regras = new ArrayList<>();
		regras.add(new Uns());
		Pontuacao dois = new Dois();
		dois.setAtivo(false);
		regras.add(dois);
		regras.add(new Tres());
		regras.add(new Quatros());
		regras.add(new Cincos());
		Pontuacao seis = new Seis();
		seis.setAtivo(false);
		regras.add(seis);
		ConjuntoDePontuacoes conjunto = new ConjuntoDePontuacoes(regras);
		
		ArrayList<Pontuacao> resposta = conjunto.getRegrasAtivas();
		
		assertEquals(4, resposta.size());
		assertEquals(Uns.class, resposta.get(0).getClass());
		assertEquals(Tres.class, resposta.get(1).getClass());
		assertEquals(Quatros.class, resposta.get(2).getClass());
		assertEquals(Cincos.class, resposta.get(3).getClass());
	}

	@Test
	void deveriaRetornarUmaListaDasRegrasNaoAtivas() throws TamanhoInvalidoException {
		ArrayList<Pontuacao> regras = new ArrayList<>();
		regras.add(new Uns());
		Pontuacao dois = new Dois();
		dois.setAtivo(false);
		regras.add(dois);
		regras.add(new Tres());
		regras.add(new Quatros());
		regras.add(new Cincos());
		Pontuacao seis = new Seis();
		seis.setAtivo(false);
		regras.add(seis);
		ConjuntoDePontuacoes conjunto = new ConjuntoDePontuacoes(regras);
			
		ArrayList<Pontuacao> resposta = conjunto.getRegrasNaoAtivas();
		
		assertEquals(2, resposta.size());
		assertEquals(Dois.class, resposta.get(0).getClass());
		assertEquals(Seis.class, resposta.get(1).getClass());
	}
	
	@Test
	void deveriaMudarUmaRegraDeAtivaParaNaoAtiva() throws TamanhoInvalidoException {
		ArrayList<Pontuacao> regras = new ArrayList<>();
		regras.add(new Uns());
		Pontuacao dois = new Dois();
		dois.setAtivo(false);
		regras.add(dois);
		regras.add(new Tres());
		regras.add(new Quatros());
		regras.add(new Cincos());
		Pontuacao seis = new Seis();
		seis.setAtivo(false);
		regras.add(seis);
		ConjuntoDePontuacoes conjunto = new ConjuntoDePontuacoes(regras);
		ArrayList<Pontuacao> resposta = conjunto.getRegrasAtivas();
		
		boolean resultado = conjunto.mudarClassificacaoDeRegra(resposta.get(0));
		
		assertTrue(resultado);
		assertEquals(3, conjunto.getNumeroDeRegrasAtivas());
		assertEquals(3, conjunto.getNumeroDeRegrasNaoAtivas());
	}
	
	@Test
	void deveriaMudarUmaRegraDeNaoAtivaParaAtiva() throws TamanhoInvalidoException {
		ArrayList<Pontuacao> regras = new ArrayList<>();
		regras.add(new Uns());
		Pontuacao dois = new Dois();
		dois.setAtivo(false);
		regras.add(dois);
		regras.add(new Tres());
		regras.add(new Quatros());
		regras.add(new Cincos());
		Pontuacao seis = new Seis();
		seis.setAtivo(false);
		regras.add(seis);
		ConjuntoDePontuacoes conjunto = new ConjuntoDePontuacoes(regras);
		ArrayList<Pontuacao> resposta = conjunto.getRegrasNaoAtivas();
		
		boolean resultado = conjunto.mudarClassificacaoDeRegra(resposta.get(0));
		
		assertTrue(resultado);
		assertEquals(5, conjunto.getNumeroDeRegrasAtivas());
		assertEquals(1, conjunto.getNumeroDeRegrasNaoAtivas());
	}
	
	@Test
	void deveriaNaoMudarUmaRegraSeElaNaoPertenceALista() throws TamanhoInvalidoException {
		ArrayList<Pontuacao> regras = new ArrayList<>();
		regras.add(new Uns());
		Pontuacao dois = new Dois();
		dois.setAtivo(false);
		regras.add(dois);
		regras.add(new Tres());
		regras.add(new Quatros());
		regras.add(new Cincos());
		Pontuacao seis = new Seis();
		seis.setAtivo(false);
		regras.add(seis);
		ConjuntoDePontuacoes conjunto = new ConjuntoDePontuacoes(regras);
		
		boolean resultado = conjunto.mudarClassificacaoDeRegra(new Seis());
		
		assertFalse(resultado);
		assertEquals(4, conjunto.getNumeroDeRegrasAtivas());
		assertEquals(2, conjunto.getNumeroDeRegrasNaoAtivas());
	}
	
	@Test 
	void deveriaEncontrarARegraQueGeraMaisPontos() throws TamanhoInvalidoException {
		ConjuntoDeDados MockConjunto = Mockito.mock(ConjuntoDeDados.class);
		int[] valores = {1,1,1,1,1};
		Mockito.when(MockConjunto.getValores()).thenReturn(valores);
		Mockito.when(MockConjunto.getNumeroDeLados()).thenReturn(6);
		ArrayList<Pontuacao> regras = new ArrayList<>();
		regras.add(new Uns());
		regras.add(new Dois());
		regras.add(new Tres());
		regras.add(new Quatros());
		regras.add(new Cincos());
		regras.add(new Seis());
		regras.add(new Par());
		regras.add(new DoisPares());
		regras.add(new Trio());
		regras.add(new Quadra());
		regras.add(new SequenciaMenor());
		regras.add(new SequenciaMaior());
		regras.add(new FullHouse());
		regras.add(new Aurora());
		ConjuntoDePontuacoes conjunto = new ConjuntoDePontuacoes(regras);
		
		Pontuacao resposta = conjunto.calcularMelhorRegra(MockConjunto);
		
		assertEquals(50, resposta.getPontuacao(MockConjunto));
	}
	
	@Test 
	void deveriaCriarUmaListaComTodasAsRegrasQueGeramPontos() throws TamanhoInvalidoException {
		ConjuntoDeDados MockConjunto = Mockito.mock(ConjuntoDeDados.class);
		int[] valores = {2,1,6,3,6};
		Mockito.when(MockConjunto.getValores()).thenReturn(valores);
		Mockito.when(MockConjunto.getNumeroDeLados()).thenReturn(6);
		ArrayList<Pontuacao> regras = new ArrayList<>();
		regras.add(new Uns());
		regras.add(new Dois());
		regras.add(new Tres());
		regras.add(new Quatros());
		regras.add(new Cincos());
		regras.add(new Seis());
		ConjuntoDePontuacoes conjunto = new ConjuntoDePontuacoes(regras);
		
		ArrayList<Pontuacao> resposta = conjunto.encontrarRegrasQueGeramPontos(MockConjunto);
		
		assertEquals(4, resposta.size());
		assertEquals(Uns.class, resposta.get(0).getClass());
		assertEquals(Dois.class, resposta.get(1).getClass());
		assertEquals(Tres.class, resposta.get(2).getClass());
		assertEquals(Seis.class, resposta.get(3).getClass());
	}
	
	@Test
	void deveriaAtivarTodasAsRegras() throws TamanhoInvalidoException {
		ArrayList<Pontuacao> regras = new ArrayList<>();
		regras.add(new Uns());
		Pontuacao dois = new Dois();
		dois.setAtivo(false);
		regras.add(dois);
		regras.add(new Tres());
		regras.add(new Quatros());
		regras.add(new Cincos());
		Pontuacao seis = new Seis();
		seis.setAtivo(false);
		regras.add(seis);
		ConjuntoDePontuacoes conjunto = new ConjuntoDePontuacoes(regras);
		
		int resposta = conjunto.ativarTodasAsRegras();
		
		assertEquals(2, resposta);
		assertEquals(6, conjunto.getNumeroDeRegrasAtivas());
		assertEquals(0, conjunto.getNumeroDeRegrasNaoAtivas());
	}
	
	@Test
	void deveriaDesativarTodasAsRegras() throws TamanhoInvalidoException {
		ArrayList<Pontuacao> regras = new ArrayList<>();
		regras.add(new Uns());
		Pontuacao dois = new Dois();
		dois.setAtivo(false);
		regras.add(dois);
		regras.add(new Tres());
		regras.add(new Quatros());
		regras.add(new Cincos());
		Pontuacao seis = new Seis();
		seis.setAtivo(false);
		regras.add(seis);
		ConjuntoDePontuacoes conjunto = new ConjuntoDePontuacoes(regras);
		
		int resposta = conjunto.desativarTodasAsRegras();
		
		assertEquals(4, resposta);
		assertEquals(0, conjunto.getNumeroDeRegrasAtivas());
		assertEquals(6, conjunto.getNumeroDeRegrasNaoAtivas());
	}
	
	@Test
	void deveriaEncontrarUmaRegraAtivaPelaClasse() throws TamanhoInvalidoException {
		ArrayList<Pontuacao> regras = new ArrayList<>();
		regras.add(new Uns());
		regras.add(new Dois());
		regras.add(new Tres());
		regras.add(new Quatros());
		regras.add(new Cincos());
		regras.add(new Seis());
		ConjuntoDePontuacoes conjunto = new ConjuntoDePontuacoes(regras);
		
		Pontuacao resposta = conjunto.encontrarRegraPorNome("Tres");
		
		assertEquals(resposta.getClass(), Tres.class);
	}
}
