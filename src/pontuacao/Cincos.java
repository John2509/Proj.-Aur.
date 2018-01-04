package pontuacao;

public class Cincos extends PontuacaoNumerica {

	public Cincos() {
		super(5);
		nome = "Cincos";
		condicao = "Haver pelo menos 1 dado com valor \"cinco\" no rolamento";
		regra = "Pontue a soma de todos os dados de valor \"cinco\"";
	}
}
