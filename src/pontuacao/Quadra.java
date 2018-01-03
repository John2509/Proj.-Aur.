package pontuacao;

import sistema.ConjuntoDeDados;

public class Quadra extends Pontuacao {

	public Quadra() {
		nome = "Quadra";
		condicao = "Haver pelo menos 4 dados de mesmo valor no rolamento";
		regra = "Pontue a soma dos quatro dados de mesmo valor";
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
