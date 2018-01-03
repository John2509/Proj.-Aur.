package pontuacao;

import sistema.ConjuntoDeDados;

public class SequenciaMaior extends Pontuacao {

	public SequenciaMaior() {
		nome = "Sequencia Maior";
		condicao = "Haver os 5 dados em ordem numérica no rolamento";
		regra = "Pontue 20 pontos";
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
