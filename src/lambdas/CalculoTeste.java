package lambdas;

public class CalculoTeste {

	public static void main(String[] args) {
		Calculo calculo = new Somar();

		System.out.println(calculo.executar(3, 7));

		calculo = new Multiplicar();

		System.out.println(calculo.executar(5, 5));
	}

}
