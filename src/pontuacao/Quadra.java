package pontuacao;

import sistema.ConjuntoDeDados;

public class Quadra extends PontuacaoGrupos {

	public Quadra() {
		nome = "Quadra";
		condicao = "Haver pelo menos 4 dados de mesmo valor no rolamento";
		regra = "Pontue a soma dos quatro dados de mesmo valor";
	}

	@Override
	public int getPontuacao(ConjuntoDeDados dados) {
		return 4*entontraRepetidos(4, dados.getValores(), dados.getNumeroDeLados());
	}

	@Override
	public boolean condicaoEValida(ConjuntoDeDados dados) {
		return entontraRepetidos(4, dados.getValores(), dados.getNumeroDeLados()) != 0;
	}

}
