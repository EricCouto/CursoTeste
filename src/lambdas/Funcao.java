package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "par" : "impar";

		System.out.println(parOuImpar.apply(33));

		Function<String, String> oResultadoE = valor -> "o resultado é: " + valor;

		Function<String, String> enfase = valor -> valor + "!?!?!?!?!";

		String resultadoFinal = parOuImpar.andThen(oResultadoE).andThen(enfase).apply(33);
		System.out.println(resultadoFinal);

	}

}
