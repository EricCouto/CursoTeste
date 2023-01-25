package classe;

public class ProdutoTeste {

	public static void main(String[] args) {

		// Scanner entrada = new Scanner(System.in);

		Produto p1 = new Produto();
		p1.nome = "notebook";
		p1.preco = 4300.50;
		p1.desconto = 0.75;
		var p2 = new Produto();
		p2.nome = "caneta";
		p2.preco = 12.80;
		p2.desconto = 0.61;

		System.out.println(p1.nome);
		System.out.println(p1.preco);
		System.out.println(p1.desconto);
		System.out.println("\n" + p2.nome);
		System.out.println(p2.preco);
		System.out.println(p2.desconto + "\n");

		double precoFinal = p1.preco * p1.desconto;
		double precoFina2 = p2.preco * p2.desconto;
		double mediaCarrinho = (precoFinal + precoFina2) / 2;

		System.out.println(precoFinal);
		System.out.println(precoFina2);
		System.out.printf("\nmedia do carrinho = R$ %.2f.", mediaCarrinho);
	}

}
