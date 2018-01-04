package pontuacao;

public class Quatros extends PontuacaoNumerica {

	public Quatros() {
		super(4);
		nome = "Quatros";
		condicao = "Haver pelo menos 1 dado com valor \"quatro\" no rolamento";
		regra = "Pontue a soma de todos os dados de valor \"quatro\"";
	}
}
