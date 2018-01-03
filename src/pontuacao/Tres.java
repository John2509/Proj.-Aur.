package pontuacao;

import sistema.ConjuntoDeDados;

public class Tres extends Pontuacao {

	public Tres() {
		nome = "Três";
		condicao = "Haver pelo menos 1 dado com valor \"três\" no rolamento";
		regra = "Pontue a soma de todos os dados de valor \"três\"";
	}

	@Override
	public int getPontuacao(ConjuntoDeDados dados) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean condicaoEValida(ConjuntoDeDados dados) {
		// TODO Auto-generated method stub
		return false;
	}

}
