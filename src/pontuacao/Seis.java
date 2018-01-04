package pontuacao;

public class Seis extends PontuacaoNumerica {

	public Seis() {
		super(6);
		nome = "Seis";
		condicao = "Haver pelo menos 1 dado com valor \"seis\" no rolamento";
		regra = "Pontue a soma de todos os dados de valor \"seis\"";
	}
}
