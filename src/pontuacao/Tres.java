package pontuacao;

public class Tres extends PontuacaoNumerica {

	public Tres() {
		super(3);
		nome = "Tr�s";
		condicao = "Haver pelo menos 1 dado com valor \"tr�s\" no rolamento";
		regra = "Pontue a soma de todos os dados de valor \"tr�s\"";
	}
}
