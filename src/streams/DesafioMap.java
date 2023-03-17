package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {

		// #1 - converter para binario;
		// #2 - inverter o valor binario;
		// #3 - imprimir os valores inteiros invertidos;

		Consumer<Object> print = System.out::println;
		
		UnaryOperator<String> inverter = 
				s -> new StringBuilder(s).reverse().toString();
		Function<String, Integer> BinariotoInt = 
				s -> Integer.parseInt(s, 2);
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		nums.stream().map(Integer::toBinaryString).map(inverter).map(BinariotoInt).forEach(print);


		// Integer. toBinaryString() método
		// StringBuilder.reverse().
		
		//		String s = "TEXTO";
		//		String invertida = new StringBuilder(s).reverse().toString();
		//		System.out.println(invertida);


	}

}
