package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {

	public static void main(String[] args) {
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2) / 2;

		System.out.println(media.apply(7.75, 6.5));

		Function<Double, String> conceito = m -> m >= 7 ? "aprovado" : "recuperação";
		System.out.println(media.andThen(conceito).apply(9.0, 5.1));

		BiFunction<Double, Double, String> resultado = (n1, n2) -> ((n1 + n2) / 2) >= 7 ? "aprovado" : "recuperação";
		System.out.println(resultado.apply(7.6, 6.3));
	}

}
