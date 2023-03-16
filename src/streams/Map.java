package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

	public static void main(String[] args) {
		Consumer<String> print = System.out::print;

		List<String> marcas = Arrays.asList("BMW ", "Honda ", "Audi ");

		marcas.stream().map(m -> m.toUpperCase()).forEach(print);

		// UnaryOperator<String> maiuscula = n -> n.toUpperCase();
		UnaryOperator<String> primeiraLetra = pL -> pL.charAt(0) + "";
		// UnaryOperator<String> grito = g -> g + "!!! ";

		System.out.println("\n\nutilizando composição ...");

		marcas.stream().map(Utilitario.maiuscula).map(primeiraLetra).map(Utilitario::grito).forEach(print);
	}

}
