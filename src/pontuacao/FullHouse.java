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
		int[] valores = dados.getValores();
		int valor1 = entontraRepetidos(2, valores);
		int valor2 = entontraRepetidos(3, valores);
		if (valor1 == 0 || valor2 == 0)
			return 0;
		return 2*valor1 + 3*valor2;
	}

	@Override
	public boolean condicaoEValida(ConjuntoDeDados dados) {
		int[] valores = dados.getValores();
		return entontraRepetidos(2, valores) != 0 && entontraRepetidos(3, valores) != 0;
	}

}
