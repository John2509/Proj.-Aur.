package sistema;

import java.util.Random;

import excecao.NumeroInvalidoException;

public class Dado {
	
	//Numero de lados do dado, ou seja o dado pode rodar um numero qualquer entre 1 e lados
	private int lados;
	//Valor que foi rolado pela ultima vez nesse dado
	private int valor;
	private Random random;

	
	//Cria um dado que, por padrao, tem 6 lados
	public Dado() {
		lados = 6;
		random = new Random();
		this.rolar();
	}
	
	//Cria um dado de n lados, desde que n > 0
	//No caso de n ser invalido, a excecao NumeroInvalidoException é lancada
	public Dado(int lados) throws NumeroInvalidoException {
		if (lados <= 0)
			throw new NumeroInvalidoException();
		this.lados = lados;
		random = new Random();
		this.rolar();
	}

	//Pega o numero de lados do dado
	public int getLados() {
		return lados;
	}

	//Gera um valor aleatorio no dado, salva e retorna esse valor
	public int rolar() {
		valor = random.nextInt(lados)+1;
		return valor;
	}

	//Pega o ultimo valor gerado pelo dado
	public int getValor() {
		return valor;
	}

	//Define um valor para o dado, desde que o valor seja valido (1 <= valor && valor <= lados)
	//No caso do valor ser invalido, a excecao NumeroInvalidoException é lancada
	public void setValor(int valor) throws NumeroInvalidoException {
		if (1 <= valor && valor <= lados)
			this.valor = valor;
		else
			throw new NumeroInvalidoException();
	}
}
