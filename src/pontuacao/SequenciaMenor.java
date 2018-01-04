package pontuacao;

import sistema.ConjuntoDeDados;

public class SequenciaMenor extends PontuacaoSequencia {

	public SequenciaMenor() {
		super(4);
		nome = "Sequencia Menor";
		condicao = "Haver pelo menos 4 dados em ordem numerica no rolamento"; 
		regra = "Pontue 15 pontos";
	}

	@Override
	public int getPontuacao(ConjuntoDeDados dados) {
		if (condicaoEValida(dados)) {
			return 15;
		}
		return 0;
	}
}
