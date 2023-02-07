package arrays.desafio;

import java.util.Scanner;

public class DesafioArray {

	public static void main(String[] args) {
		int indice = 0;
		double soma = 0;

		Scanner entrada = new Scanner(System.in);

		System.out.println("digite o numero de notas que serão informadas:");
		indice = entrada.nextInt();

		double[] notas = new double[indice];

		for (int i = 0; i < indice; i++) {

			System.out.println("informe a " + (i + 1) + "º nota:");

			notas[i] = entrada.nextDouble();
		}

		for (double nota : notas) {

			soma += nota;

		}

		System.out.println("a media do aluno é: " + soma / indice);

		entrada.close();
	}

}
