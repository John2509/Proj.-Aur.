package pontuacao;

import sistema.ConjuntoDeDados;

public class SequenciaMenor extends Pontuacao {

	public SequenciaMenor() {
		nome = "Sequencia Menor";
		condicao = "Haver pelo menos 4 dados em ordem numérica no rolamento"; 
		regra = "Pontue 15 pontos";
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
