package controle.lista;

import java.util.Scanner;

public class Lista2Questao5 {

	public static void main(String[] args) {
		
//5. Refatorar o exercício 04, utilizando a estrutura switch.
		
		int contadorDeDivisores = 0;
		Scanner entrada = new Scanner(System.in);
		System.out.println("informe um numero inteiro");
		int numero = entrada.nextInt();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}

		switch (contadorDeDivisores) {
		case 0: {

			System.out.println(numero + " é um numero primo");
			break;
		}
		default:
			System.out.println(numero + " não é um numero primo");
		}

		entrada.close();

	}

}
