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
		return entontraRepetidos(5, dados.getValores(), dados.getNumeroDeLados()) != 0;
	}

}
