package pontuacao;

import sistema.ConjuntoDeDados;

public class Aurora extends Pontuacao {

	public Aurora() {
		nome = "Aurora";
		condicao = "Haver 5 dados de mesmo valor no rolamento";
		regra = "Pontue 50 pontos";
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
