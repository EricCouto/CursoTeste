package lambdas;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {
		Predicate<Produto> isCaro = prod -> (prod.preco * prod.desconto) >= 33100;

		Produto produto = new Produto("notebook", 3893.89, 0.85);

		System.out.println(isCaro.test(produto));
		// System.out.println(produto.preco * produto.desconto);
	}

}
