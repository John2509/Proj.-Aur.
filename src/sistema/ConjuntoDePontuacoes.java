package sistema;

import java.util.ArrayList;

import excecao.TamanhoInvalidoException;
import pontuacao.Pontuacao;

public class ConjuntoDePontuacoes {

	private ArrayList<Pontuacao> regrasAtivas;
	private ArrayList<Pontuacao> regrasNaoAtivas;
	
	//Cria um Conjunto de pontucoes com um numero nao nulo de elemntos
	//Se regras for vazio, lanca uma exception
	public ConjuntoDePontuacoes(ArrayList<Pontuacao> regras) throws TamanhoInvalidoException {
		if (regras.isEmpty())
			throw new TamanhoInvalidoException();
		regrasAtivas = new ArrayList<>();
		regrasNaoAtivas = new ArrayList<>();
                regras.forEach((regra) -> {
                    if (regra.getAtivo())
                        regrasAtivas.add(regra);
                    else
                        regrasNaoAtivas.add(regra);
            });
	}

	//Regras ativas sao aquelas que o programa permite calcular
	public int getNumeroDeRegrasAtivas() {
		return regrasAtivas.size();
	}
	
	//Regras nao ativas nao sao calculadas
	public int getNumeroDeRegrasNaoAtivas() {
		return regrasNaoAtivas.size();
	}

	//Adiciona outra regra a lista adequada
	public void adicionar(Pontuacao regra) {
		if(regra.getAtivo())
			regrasAtivas.add(regra);
		else
			regrasNaoAtivas.add(regra);
	}

	//Cria um clone da lista de regras ativas
	@SuppressWarnings("unchecked")
	public ArrayList<Pontuacao> getRegrasAtivas() {
		return (ArrayList<Pontuacao>) regrasAtivas.clone();
	}

	//Cria um clone da lista de regras nao ativas
	@SuppressWarnings("unchecked")
	public ArrayList<Pontuacao> getRegrasNaoAtivas() {
		return (ArrayList<Pontuacao>) regrasNaoAtivas.clone();
	}

	//Muda uma regra que pertenca ao conjunto de ativa para nao ativa e vice versa
	public boolean mudarClassificacaoDeRegra(Pontuacao regra) {
		if (regrasAtivas.contains(regra)) {
			regra.setAtivo(false);
			regrasNaoAtivas.add(regra);
			regrasAtivas.remove(regra);
			return true;
		} else if (regrasNaoAtivas.contains(regra)) {
			regra.setAtivo(true);
			regrasAtivas.add(regra);
			regrasNaoAtivas.remove(regra);
			return true;
		}
		return false;
	}

	//Retorna a melhor regra ativa para um conjunto de dados
	public Pontuacao calcularMelhorRegra(ConjuntoDeDados dados) {
		int maiorPontuacao = 0;
		int index = 0;
		for (Pontuacao regra : regrasAtivas) {
			if(regra.getPontuacao(dados) > maiorPontuacao) {
				index = regrasAtivas.indexOf(regra);
			}
		}
		if (regrasAtivas.isEmpty())
			return null;
		return regrasAtivas.get(index);
	}

	//Retorna todas as regras que nao tem pontucao 0 para um conjunto de dados
	public ArrayList<Pontuacao> encontrarRegrasQueGeramPontos(ConjuntoDeDados dados) {
		ArrayList<Pontuacao> resposta = new ArrayList<>();
		for (Pontuacao regra : regrasAtivas) {
			if (regra.condicaoEValida(dados))
				resposta.add(regra);
		}
		return resposta;
	}

	//Torna todas as regras no conjunto ativas
	public int ativarTodasAsRegras() {
		int res = 0;
		for (Pontuacao regra : this.getRegrasNaoAtivas()) {
			regra.setAtivo(true);
			regrasAtivas.add(regra);
			regrasNaoAtivas.remove(regra);
			res++;
		}
		return res;
	}

	//Torna todas as regras no conjunto nao ativas
	public int desativarTodasAsRegras() {
		int res = 0;
		for (Pontuacao regra : this.getRegrasAtivas()) {
			regra.setAtivo(false);
			regrasNaoAtivas.add(regra);
			regrasAtivas.remove(regra);
			res++;
		}
		return res;
	}

	//Retorna a primeira regra com o nome
	public Pontuacao encontrarRegraPorNome(String nome) {
		for (Pontuacao regra : regrasAtivas) {
			if (regra.getNome().equals(nome))
				return regra;
		}
		return null;
	}

}
