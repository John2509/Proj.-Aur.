package pontuacao;

import sistema.ConjuntoDeDados;

public class Aurora extends Pontuacao {

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
		int valor = valores[0];
		for(int i = 1; i < valores.length; i++)
			if (valores[i] != valor)
				return false;
		return true;
	}

}
