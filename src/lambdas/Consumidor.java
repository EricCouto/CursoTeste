package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome + "!!!");
		Produto p1 = new Produto("caneta", 5.5, 0.92);
		imprimirNome.accept(p1);

		Produto p2 = new Produto("lapis", 2.5, 0.97);
		Produto p3 = new Produto("borracha", 3.5, 0.95);
		Produto p4 = new Produto("caderno", 25.5, 0.87);
		Produto p5 = new Produto("livro", 265.79, 0.75);

		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}

}
