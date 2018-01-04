package pontuacao;

import sistema.ConjuntoDeDados;

public class SequenciaMaior extends PontuacaoSequencia {

	public SequenciaMaior() {
		super(5);
		nome = "Sequencia Maior";
		condicao = "Haver os 5 dados em ordem numerica no rolamento";
		regra = "Pontue 20 pontos";
	}

	@Override
	public int getPontuacao(ConjuntoDeDados dados) {
		if (condicaoEValida(dados)) {
			return 20;
		}
		return 0;
	}
}
