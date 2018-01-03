package pontuacao;

import sistema.ConjuntoDeDados;

public class Par extends Pontuacao {

	public Par() {
		nome = "Par";
		condicao = "Haver pelo menos 2 dados de mesmo valor no rolamento";
		regra = "Pontue a soma dos dois dados de mesmo valor";
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
