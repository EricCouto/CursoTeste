package classe;

import java.util.Scanner;

public class DataTeste {

	public static void main(String[] args) {
		Data aniversario = new Data();
		Data aleatoria = new Data();

		aleatoria.dia = 27;
		aleatoria.mes = "Janeiro";
		aleatoria.ano = 1986;

		Scanner entrada = new Scanner(System.in);

		System.out.println("digite o dia do seu aniversario");
		aniversario.dia = entrada.nextInt();

		System.out.println("digite o mes do seu aniversario por extenso");
		aniversario.mes = entrada.next();

		System.out.println("digite o ano do seu aniversario");
		aniversario.ano = entrada.nextInt();

		String niver = aniversario.organizarData();
		// String ale = aleatoria.organizarData();

		System.out.println(niver);
		System.out.println(aleatoria.organizarData() + "\n\n");

		aleatoria.imprimirData();
		aniversario.imprimirData();

		/*
		 * System.out.printf("\na data de seu aniversario é : %d/%s/%d",
		 * aniversario.dia, aniversario.mes, aniversario.ano);
		 */
		// System.out.printf("\n\na data aleatoria escolhida foi: %d/%s/%d",
		// aleatoria.dia, aleatoria.mes, aleatoria.ano);

		entrada.close();

	}

}
