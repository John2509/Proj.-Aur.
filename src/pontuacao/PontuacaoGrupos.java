package pontuacao;

public abstract class PontuacaoGrupos extends Pontuacao{
	
	//Encontra os numeros que repetem repeticoes e apenas repeticoes veses
	//Retorna o maior numero que repete
	//se nenhum repete, retorna 0
	//Lados é o numero de faces dos dados
	protected int entontraRepetidos(int repeticoes, int[] valores, int lados) {
		for (int i = lados; i >= 1; i--) {
			int valor = encontrar(repeticoes, valores, i);
			if (valor != 0)
				return valor;
		}
		return 0;
	}
	
	//Encontra os numeros que repetem repeticoes e apenas repeticoes veses
	//Ele ignora o valor ignorar
	//Retorna o maior numero que repete
	//se nenhum repete, retorna 0
	//Lados é o numero de faces dos dados
	protected int entontraRepetidos(int repeticoes, int[] valores, int lados, int ignorar) {
		for (int i = lados; i >= 1; i--) {
			if (i != ignorar) {
				int valor = encontrar(repeticoes, valores, i);
				if (valor != 0)
					return valor;
			}
		}
		return 0;
	}
	
	private int encontrar(int repeticoes, int[] valores, int i) {
		int repeticaoParcial = 0;
		for(int j = 0; j < valores.length; j++) {
			if (valores[j] == i)
				repeticaoParcial++;
		}
		if (repeticaoParcial == repeticoes)
			return i;
		return 0;
	}

}
