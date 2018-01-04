package pontuacao;

public class Dois extends PontuacaoNumerica {

	public Dois() {
		super(2);
		nome = "Dois";
		condicao = "Haver pelo menos 1 dado com valor \"dois\" no rolamento";
		regra = "Pontue a soma de todos os dados de valor \"dois\"";
	}
}
