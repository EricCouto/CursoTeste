package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {

		Calculo calc = (x, y) -> {
			return x + y;
		};

		System.out.println(calc.executar(3, 7));

		calc = (x, y) -> x * y;
		System.out.println(calc.executar(5, 5));

		System.out.println(calc.legal());
		System.out.println(Calculo.muitoLegal());

		/*
		 * Para as lambda funcionar a interface precisar ser funcional (ter apenas um
		 * metodo)
		 */

	}

}
