package pontuacao;

public class Tres extends PontuacaoNumerica {

	public Tres() {
		super(3);
		nome = "Tres";
		condicao = "Haver pelo menos 1 dado com valor \"tres\" no rolamento";
		regra = "Pontue a soma de todos os dados de valor \"tres\"";
	}
}
