package lambdas;

@FunctionalInterface
public interface Calculo {

	double executar(double a, double b);

	default String legal() {
		return "legal";
	}

	static String muitoLegal() {
		return "muito legal";
	}

	/*
	 * ainda executa metodos default e static mas apenas terá um unico metodo
	 * abstract
	 */
}
