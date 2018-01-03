package pontuacao;

import sistema.ConjuntoDeDados;

public class Quatros extends Pontuacao {

	public Quatros() {
		nome = "Quatros";
		condicao = "Haver pelo menos 1 dado com valor \"quatro\" no rolamento";
		regra = "Pontue a soma de todos os dados de valor \"quatro\"";
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
