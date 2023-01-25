package controle.lista;

import java.util.Random;
import java.util.Scanner;

public class Lista2Questao6 {

	public static void main(String[] args) {
		/*
		 * 6. Jogo da adivinhação: Tentar adivinhar um número entre 0 - 100. Armazene um
		 * numero aleatório em uma variável. O Jogador tem 10 tentativas para adivinhar
		 * o número gerado. Ao final de cada tentativa, imprima a quantidade de
		 * tentativas restantes, e imprima se o número inserido é maior ou menor do que
		 * o número armazenado.
		 */
		int numeroSorteado;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Sorteando numero entre 0 e 100...\n");
		Random numeroAleatorio = new Random();
		numeroSorteado = numeroAleatorio.nextInt(101);

		System.out.println("Começou o jogo! Sera que consegue me vencer?");
		int tentativas = 10;

		for (int i = 1; i < 11; i++) {

			System.out.println("\ndigite um numero:  ");
			int numero = entrada.nextInt();

			if (numero > numeroSorteado) {
				tentativas--;
				System.out.println("o numero sorteado é menor, restam " + tentativas + " chances");
			} else if (numero < numeroSorteado) {
				tentativas--;
				System.out.println("o numero sorteado é maior, restam " + tentativas + " chances");
			} else {
				System.out.println("parabens vc acertou!!!");
				tentativas = i;
				break;
			}

		}
		System.out.printf(" o numero sorteado foi %d e foi usado %d das tentativas", numeroSorteado, tentativas);
		entrada.close();
	}

}
