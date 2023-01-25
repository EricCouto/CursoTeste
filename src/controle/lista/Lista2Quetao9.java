package controle.lista;

import java.util.Scanner;

public class Lista2Quetao9 {

	public static void main(String[] args) {
		// 9 Crie um programa que recebe 10 valores e ao final imprima o maior número.

		Scanner entrada = new Scanner(System.in);
		double numero;

		double maior = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.println("digite um numero: ");
			numero = entrada.nextDouble();

			if (i == 1) {
				//System.out.println(maior);
				maior = numero;
				//System.out.println(maior);
			} else if (maior < numero) {
				maior = numero;
			}

		}
		System.out.println("o maior valor digitado foi: " + maior);
		entrada.close();

	}

}
