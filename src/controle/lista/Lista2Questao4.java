package controle.lista;

import java.util.Scanner;

public class Lista2Questao4 {

	public static void main(String[] args) {

		// 4. Criar um programa que receba um número e diga se ele é um número primo.
		
		int contadorDeDivisores = 0;

		Scanner entrada = new Scanner(System.in);
		System.out.println("informe um numero inteiro");
		int numero = entrada.nextInt();

		int resto = numero % 10;
		int divisor = numero / 10;
		
		boolean veri2 = numero % 2 == 0;
		boolean veri3 = (resto + divisor) % 3 == 0;
		boolean veri5 = numero % 5 == 0;

		if (veri2 == false && veri3 == false && veri5 == false) {
			System.out.println(numero + " é um um numero primo ");
		} else
			System.out.println(numero + " não é primo");

		System.out.println();

		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				contadorDeDivisores++;
			}
		}

		if (contadorDeDivisores == 0) {
			System.out.println("\no numero " + numero + " é primo.");
		} else {
			System.out.println("\no numero " + numero + " não é primo.");
		}

		entrada.close();
	}

}

/*
 * "Para identificar um número primo devemos dividi-lo sucessivamente por
 * números primos como: 2, 3, 5. . . e verificar se a divisão é exata (em que o
 * resto é zero) ou não exata (onde o resto é diferente de zero).
 * 
 * Se o resto da divisão for zero o número não é primo.
 * 
 * Se nenhum resto for zero, o número é primo.
 * 
 * Para dividir um número de forma mais rápida podemos utilizar os critérios de
 * divisibilidade, mas somente quando os divisores forem números primos, como 2,
 * 3, 5 e 11. Recorde-se que:
 * 
 * Um número é divisível por 2 quando terminado em termos pares, ou seja, 0, 2,
 * 4, 6. . .
 * 
 * Um número será divisível por três quando a soma dos seus algarismos for
 * divisível por 3.
 * 
 * Um número será divisível por 5 quando o seu último algarismo for 5 ou 0."
 * 
 * Veja mais sobre "Como reconhecer os números primos" em:
 * https://brasilescola.uol.com.br/matematica/como-reconhecer-os-numeros-primos.
 * htm
 */
