package pontuacao;

import sistema.ConjuntoDeDados;

public abstract class Pontuacao {
	protected String nome = "nome";
	protected String condicao = "condicao";
	protected String regra = "regra";
	
	public String getNome() {
		return nome;
	}
	
	public String getCondicao() {
		return condicao;
	}
	
	public String getRegra() {
		return regra;
	}
	
	public abstract int getPontuacao(ConjuntoDeDados dados);
	public abstract boolean condicaoEValida(ConjuntoDeDados dados);
}
