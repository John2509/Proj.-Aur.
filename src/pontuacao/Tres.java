package pontuacao;

import sistema.ConjuntoDeDados;

public class Tres extends Pontuacao {

	public Tres() {
		nome = "Tr�s";
		condicao = "Haver pelo menos 1 dado com valor \"tr�s\" no rolamento";
		regra = "Pontue a soma de todos os dados de valor \"tr�s\"";
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
