package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {

	public static void main(String[] args) {

		BinaryOperator<Integer> calc = (x, y) -> {
			return x + y;
		};

		System.out.println(calc.apply(3, 7));

		calc = (x, y) -> x * y;
		System.out.println(calc.apply(5, 5));

		BinaryOperator<Double> calc2 = (x, y) -> {
			return x + y;
		};

		System.out.println(calc2.apply(3.0, 7.0));

		calc2 = (x, y) -> x * y;
		System.out.println(calc2.apply(5.0, 5.0));

	}

}
