package pontuacao;

import sistema.ConjuntoDeDados;

public class Cincos extends Pontuacao {

	public Cincos() {
		nome = "Cincos";
		condicao = "Haver pelo menos 1 dado com valor \"cinco\" no rolamento";
		regra = "Pontue a soma de todos os dados de valor \"cinco\"";
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
