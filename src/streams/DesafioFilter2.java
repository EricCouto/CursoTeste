package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter2 {

	public static void main(String[] args) {
		Produto p1 = new Produto("Whey protein", 99.90, 0.9, 30);
		Produto p2 = new Produto("Creatina", 139.90, 0.85, 0);
		Produto p3 = new Produto("Pré treino", 149.90, 0.8, 0);
		Produto p4 = new Produto("Termogenico", 99.90, 0.95, 15);
		Produto p5 = new Produto("Multi vitaminico", 39.90, 0.97, 10);

		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

		Predicate<Produto> superPromo = p -> p.desconto >= 0.8;
		Predicate<Produto> freteGratis = p -> p.valorFrete <= 20;
		Predicate<Produto> precoRelevante = p -> p.preco >= 100;
		Function<Produto, String> promocao = p -> "aproveite!!! " + p.nome + " por R$" + p.preco;

		produtos.stream()
			.filter(freteGratis)
			.filter(superPromo)
			.filter(precoRelevante)
			.map(promocao)
			.forEach(System.out::println);

	}

}
