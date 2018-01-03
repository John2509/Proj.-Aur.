package pontuacao;

import sistema.ConjuntoDeDados;

public class Trio extends Pontuacao {

	public Trio() {
		nome = "Trio";
		condicao = "Haver pelo menos 3 dados de mesmo valor no rolamento";
		regra = "Pontue a soma dos três dados de mesmo valor";
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
