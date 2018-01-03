package sistema;

import java.util.ArrayList;
import excecao.NumeroInvalidoException;
import excecao.TamanhoInvalidoException;

public class ConjuntoDeDados {
	
	ArrayList<Dado> dados;

	//Se o dados for vazio, uma exception é lancada
	public ConjuntoDeDados(ArrayList<Dado> dados) throws TamanhoInvalidoException {
		if(dados.isEmpty()) {
			throw new TamanhoInvalidoException();
		}
		this.dados = dados;
	}

	//Retorna a quantidade de dados
	public int tamanhoDoConjunto() {
		return dados.size();
	}

	//Retorna um array de int com os valores dos dados
	public int[] getValores() {
		int[] resultado = new int[dados.size()];
		for (int i = 0; i < dados.size(); i++) {
			resultado[i] = dados.get(i).getValor();
		}
		return resultado;
	}

	//Retorna o valor do dado na posicao index
	//Se o index for invalido, lanca uma exception
	public int getValor(int index) throws NumeroInvalidoException {
		if (index >= 0 && index < dados.size())
			return dados.get(index).getValor();
		throw new NumeroInvalidoException();
	}

	//Gera novos valores para todos os dados
	//Retorna um array de int com os novos valores
	public int[] rolarTodos() {
		int[] resultado = new int[dados.size()];
		for (int i = 0; i < dados.size(); i++) {
			resultado[i] = dados.get(i).rolar();
		}
		return resultado;
	}

	//Gera um novo valor para o dado na posicao index e retorna esse novo valor
	//Se o index for invalido, lanca uma exception
	public int rolar(int index) throws NumeroInvalidoException {
		if (index >= 0 && index < dados.size())
			return dados.get(index).rolar();
		throw new NumeroInvalidoException();
	}

	//Coloca novos valores em todos os dados
	//Retorna a quantidade de dados que realmente foram setados
	//Se valores for maior que o numero de dados, os valores extras sao ignorados
	//Se valores for menor que o numero de dados, os dados que extras se mantem
	public int setValores(int[] valores) {
		int i = 0;
		int funcionou = 0;
		while (i < valores.length && i < dados.size()) {
			try {
				dados.get(i).setValor(valores[i]);
				funcionou++;
			} catch (NumeroInvalidoException e) {
			}
			i++;
		}
		return funcionou;
	}

	//Coloca um valor no dados da posicao index
	//Retorna uma boleana indicando o sucesso da opracao
	//Se o index for invalido, lanca uma exception
	public Boolean setValor(int valor, int index) {
		if (index >= 0 && index < dados.size()) {
			try {
				dados.get(index).setValor(valor);
				return true;
			} catch (NumeroInvalidoException e) {
			}
		}
		return false;
	}

}
