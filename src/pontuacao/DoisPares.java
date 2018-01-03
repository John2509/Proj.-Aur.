package pontuacao;

import sistema.ConjuntoDeDados;

public class DoisPares extends Pontuacao {

	public DoisPares() {
		nome = "Dois Pares";
		condicao = "Haver pelo menos 2 pares de dados distintos no rolamento";
		regra = "Pontue a soma dos quatro dados que integram os pares";
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
