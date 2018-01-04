package pontuacao;

import sistema.ConjuntoDeDados;

public class Trio extends PontuacaoGrupos {

	public Trio() {
		nome = "Trio";
		condicao = "Haver pelo menos 3 dados de mesmo valor no rolamento";
		regra = "Pontue a soma dos três dados de mesmo valor";
	}

	@Override
	public int getPontuacao(ConjuntoDeDados dados) {
		return 3*entontraRepetidos(3, dados.getValores(), dados.getNumeroDeLados());
	}

	@Override
	public boolean condicaoEValida(ConjuntoDeDados dados) {
		return entontraRepetidos(3, dados.getValores(), dados.getNumeroDeLados()) != 0;
	}

}
