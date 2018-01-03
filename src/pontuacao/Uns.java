package pontuacao;

import sistema.ConjuntoDeDados;

public class Uns extends Pontuacao {

	public Uns() {
		nome = "Uns";
		condicao = "Haver pelo menos 1 dado com valor \"um\" no rolamento";
		regra = "Pontue a soma de todos os dados de valor \"um\"";
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
