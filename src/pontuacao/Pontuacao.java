package pontuacao;

import sistema.ConjuntoDeDados;

public abstract class Pontuacao {
	protected String nome = "nome";
	protected String condicao = "condicao";
	protected String regra = "regra";
	//O boolean ativo indica de uma regra vai ser aplivavel em um jogo
	protected boolean ativo = true;
	
	public String getNome() {
		return nome;
	}
	
	public String getCondicao() {
		return condicao;
	}
	
	public String getRegra() {
		return regra;
	}
	
	public boolean getAtivo() {
		return ativo;
	}
	
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public abstract int getPontuacao(ConjuntoDeDados dados);
	public abstract boolean condicaoEValida(ConjuntoDeDados dados);
}
