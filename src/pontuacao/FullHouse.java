package pontuacao;

import sistema.ConjuntoDeDados;

public class FullHouse extends Pontuacao {

	public FullHouse() {
		nome = "Full House";
		condicao = "Haver 1 par e 1 trio no rolamento";
		regra = "Pontue a soma de todos os 5 dados";
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
