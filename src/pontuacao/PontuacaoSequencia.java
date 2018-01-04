package pontuacao;

import sistema.ConjuntoDeDados;

public abstract class PontuacaoSequencia extends Pontuacao {

	private int tamanho;
	private boolean crescente = true;
	private boolean decrescente = true;
	
	public PontuacaoSequencia(int tamanho) {
		this.tamanho = tamanho;
	}

	@Override
	public boolean condicaoEValida(ConjuntoDeDados dados) {
		int[] valores = dados.getValores();
		int lados = dados.getNumeroDeLados();
		for (int i = 0; i + tamanho <= valores.length; i++) {
			if (crescente) {
				int valorInicial = 0;
				for (int k = 1; k <= lados-tamanho+1 && valorInicial == 0; k++) {
					if (valores[i] == k) {
						valorInicial = k;
					}
				}
				int j;
				for (j = 1; j < tamanho && valorInicial != 0; j++) {
					if (valores[i+j] != valorInicial+j) {
						break;
					}
				}
				if (j == tamanho)
					return true;
			}
			if (decrescente) {
				int valorInicial = 0;
				for (int k = lados; k >= tamanho && valorInicial == 0; k--) {
					if (valores[i] == k) {
						valorInicial = k;
					}
				}
				int j;
				for (j = 1; j < tamanho && valorInicial != 0; j++) {
					if (valores[i+j] != valorInicial-j) {
						break;
					}
				}
				if (j == tamanho)
					return true;
			}
		}
		return false;
	}
}