package pontuacao;

import sistema.ConjuntoDeDados;

public abstract class Pontuacao {
	protected String nome = "nome";
	protected String condicao = "condicao";
	protected String regra = "regra";
	//O boolean valido indica de uma regra vai ser aplivavel em um jogo
	protected boolean valido = true;
	
	public String getNome() {
		return nome;
	}
	
	public String getCondicao() {
		return condicao;
	}
	
	public String getRegra() {
		return regra;
	}
	
	public boolean getValido() {
		return valido;
	}
	
	public void setValido(boolean valido) {
		this.valido = valido;
	}
	
	public abstract int getPontuacao(ConjuntoDeDados dados);
	public abstract boolean condicaoEValida(ConjuntoDeDados dados);
}
