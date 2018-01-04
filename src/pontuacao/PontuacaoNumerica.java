package pontuacao;

import sistema.ConjuntoDeDados;

public abstract class PontuacaoNumerica extends Pontuacao {

	int valor;
	
	public PontuacaoNumerica(int valor) {
		this.valor = valor;
	}

	@Override
	public int getPontuacao(ConjuntoDeDados dados) {
		int resultado = 0;
		int[] valores = dados.getValores();
		for (int i = 0; i < valores.length; i++) 
			if (valores[i] == valor)
				resultado += valor;
		return resultado;
	}

	@Override
	public boolean condicaoEValida(ConjuntoDeDados dados) {
		int[] valores = dados.getValores();
		for(int i = 0; i < valores.length; i++) {
			if (valores[i] == valor)
				return true;
		}
		return false;
	}

}
