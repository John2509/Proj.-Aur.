package pontuacao;

import sistema.ConjuntoDeDados;

public class DoisPares extends PontuacaoGrupos {

	public DoisPares() {
		nome = "Dois Pares";
		condicao = "Haver pelo menos 2 pares de dados distintos no rolamento";
		regra = "Pontue a soma dos quatro dados que integram os pares";
	}

	@Override
	public int getPontuacao(ConjuntoDeDados dados) {
		int valor1 = entontraRepetidos(2, dados.getValores(), dados.getNumeroDeLados());
		if (valor1 == 0)
			return 0;
		int valor2 = entontraRepetidos(2, dados.getValores(), dados.getNumeroDeLados(), valor1);
		if (valor2 == 0)
			return 0;
		return 2*valor1 + 2*valor2;
	}

	@Override
	public boolean condicaoEValida(ConjuntoDeDados dados) {
		int valor = entontraRepetidos(2, dados.getValores(), dados.getNumeroDeLados());
		if (valor == 0)
			return false;
		return entontraRepetidos(2, dados.getValores(), dados.getNumeroDeLados(), valor) != 0;
	}

}
