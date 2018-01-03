package pontuacao;

import sistema.ConjuntoDeDados;

public class Seis extends Pontuacao {

	public Seis() {
		nome = "Seis";
		condicao = "Haver pelo menos 1 dado com valor \"seis\" no rolamento";
		regra = "Pontue a soma de todos os dados de valor \"seis\"";
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
