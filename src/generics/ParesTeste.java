package generics;

public class ParesTeste {

	public static void main(String[] args) {
		Pares<Integer, String> resultadoConcurso = new Pares<>();

		resultadoConcurso.adicionar(1, "Maria");
		resultadoConcurso.adicionar(2, "ana");
		resultadoConcurso.adicionar(3, "gui");
		resultadoConcurso.adicionar(4, "eric");
		resultadoConcurso.adicionar(2, "lucas");
		
		System.out.println(resultadoConcurso.getValor(1));
		System.out.println(resultadoConcurso.getValor(4));
		System.out.println(resultadoConcurso.getValor(2));
	}

}
