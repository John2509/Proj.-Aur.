package pontuacao;

import sistema.ConjuntoDeDados;

public class Aurora extends PontuacaoGrupos {

	public Aurora() {
		nome = "Aurora";
		condicao = "Haver 5 dados de mesmo valor no rolamento";
		regra = "Pontue 50 pontos";
	}

	@Override
	public int getPontuacao(ConjuntoDeDados dados) {
		if (condicaoEValida(dados))
			return 50;
		return 0;
	}

	@Override
	public boolean condicaoEValida(ConjuntoDeDados dados) {
		int[] valores = dados.getValores();
		return entontraRepetidos(5, valores) != 0;
	}

}
