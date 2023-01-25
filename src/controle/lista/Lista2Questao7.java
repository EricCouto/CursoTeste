package controle.lista;

import java.util.Scanner;

public class Lista2Questao7 {

	public static void main(String[] args) {
		/*
		 * 7 Criar um programa que enquanto estiver recebendo números positivos, imprime
		 * no console a soma dos números inseridos, caso receba um número negativo,
		 * encerre o programa. Tente utilizar a estrutura do while.
		 */
		double valor = 0;
		double soma = 0;

		Scanner entrada = new Scanner(System.in);
		while (valor >= 0) {
			System.out.println("digite um numero: ");
			valor = entrada.nextDouble();

			if (valor > 0)
				soma = soma + valor;

		}

		System.out.println(" a soma dos numeros ficou: " + soma);
		entrada.close();

	}

}
