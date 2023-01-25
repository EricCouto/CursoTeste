package controle.lista;

import java.util.Scanner;

public class Lista2Questao2 {

	public static void main(String[] args) {
		/* 2 Criar um programa que informa se o ano atual é um ano bissexto; */

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o ano: ");
		int ano = scanner.nextInt();

		boolean bissexto = ano % 4 == 0 && ((ano % 100) != 0 || ano % 400 == 0);

		if (bissexto == true) {
			System.out.println(ano + " é um ano bissexto");
		} else {
			System.out.println(ano + " não é um ano bissexto");
		}
		scanner.close();

	}

}
/*
 * Para ser bissexto, o ano deve ser:
 * 
 * Divisível por 4. Sendo assim, a divisão é exata com o resto igual a zero;
 * 
 * Não pode ser divisível por 100. Com isso, a divisão não é exata, ou seja,
 * deixa resto diferente de zero;
 * 
 * Pode ser que seja divisível por 400. Caso seja divisível por 400, a divisão
 * deve ser exata, deixando o resto igual a zero.
 */