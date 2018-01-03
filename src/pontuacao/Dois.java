package pontuacao;

import sistema.ConjuntoDeDados;

public class Dois extends Pontuacao {

	public Dois() {
		nome = "Dois";
		condicao = "Haver pelo menos 1 dado com valor \"dois\" no rolamento";
		regra = "Pontue a soma de todos os dados de valor \"dois\"";
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
