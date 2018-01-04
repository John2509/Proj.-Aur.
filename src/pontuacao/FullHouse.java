package pontuacao;

import sistema.ConjuntoDeDados;

public class FullHouse extends PontuacaoGrupos {

	public FullHouse() {
		nome = "Full House";
		condicao = "Haver 1 par e 1 trio no rolamento";
		regra = "Pontue a soma de todos os 5 dados";
	}

	@Override
	public int getPontuacao(ConjuntoDeDados dados) {
		int valor1 = entontraRepetidos(2, dados.getValores(), dados.getNumeroDeLados());
		int valor2 = entontraRepetidos(3, dados.getValores(), dados.getNumeroDeLados());
		if (valor1 == 0 || valor2 == 0)
			return 0;
		return 2*valor1 + 3*valor2;
	}

	@Override
	public boolean condicaoEValida(ConjuntoDeDados dados) {
		return entontraRepetidos(2, dados.getValores(), dados.getNumeroDeLados()) != 0 && entontraRepetidos(3, dados.getValores(), dados.getNumeroDeLados()) != 0;
	}

}
