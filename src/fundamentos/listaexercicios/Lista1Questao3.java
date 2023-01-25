package fundamentos.listaexercicios;

import java.util.Scanner;

public class Lista1Questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Q3 Criar um programa que leia o peso e a altura do usuário e imprima no
		// console o IMC.

		Scanner entrada = new Scanner(System.in);

		System.out.print("digite a sua altura em metros:	");
		double alt = entrada.nextDouble();

		System.out.print("digite a sua peso:	");
		double peso = entrada.nextDouble();

		double imc = (peso / (alt * alt));

		System.out.printf("seu imc é de: %.2f", imc);

		entrada.close();

	}

}
