package controle.lista;

import java.util.Scanner;

public class Lista2Questao8 {

	public static void main(String[] args) {
		/*
		 * 8. Criar um programa que receba uma palavra e imprime no console letra por
		 * letra.
		 */

		Scanner entrada = new Scanner(System.in);

		System.out.println("digite uma palavra: ");
		String palavra = entrada.nextLine();

		char vetor[] = palavra.toCharArray();

		for (int i = 0; i < palavra.length(); i++) {
			System.out.println(vetor[i]);
		}

		entrada.close();
	}

}
