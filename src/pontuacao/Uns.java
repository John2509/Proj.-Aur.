package pontuacao;

public class Uns extends PontuacaoNumerica {

	public Uns() {
		super(1);
		nome = "Uns";
		condicao = "Haver pelo menos 1 dado com valor \"um\" no rolamento";
		regra = "Pontue a soma de todos os dados de valor \"um\"";
	}
}
