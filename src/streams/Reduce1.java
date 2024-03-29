package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

	public static void main(String[] args) {

		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		BinaryOperator<Integer> soma = (ac, n) -> ac + n;

		Integer total = nums.stream().reduce(soma).get();
		System.out.println(total);

		Integer total2 = nums.parallelStream().reduce(100, soma);// com o parallelStream o valor 100 é passado em cada
		System.out.println(total2); // execução

		Integer total3 = nums.stream().reduce(100, soma); // nesse passar o valor 100 na primeira iteração apenas
		System.out.println(total3);

		nums.stream()
		.filter(n -> n > 5)// filtrou
		.reduce(soma)// o resultado foi um opcional de Integer
		.ifPresent(System.out::println);// função dentro do opcional 
		
	}

}
