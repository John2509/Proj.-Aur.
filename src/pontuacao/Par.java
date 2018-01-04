package pontuacao;

import sistema.ConjuntoDeDados;

public class Par extends PontuacaoGrupos {

	public Par() {
		nome = "Par";
		condicao = "Haver pelo menos 2 dados de mesmo valor no rolamento";
		regra = "Pontue a soma dos dois dados de mesmo valor";
	}

	@Override
	public int getPontuacao(ConjuntoDeDados dados) {
		return 2*entontraRepetidos(2, dados.getValores());
	}

	@Override
	public boolean condicaoEValida(ConjuntoDeDados dados) {
		return entontraRepetidos(2, dados.getValores()) != 0;
	}

}
