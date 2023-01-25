package fundamentos.listaexercicios;

import java.util.Scanner;

public class Lista1questao5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Q5 Criar um programa que leia o valor da base e da altura de um triângulo e
		// calcule a área.

		Scanner entrada = new Scanner(System.in);

		System.out.print("digite o valor da base do triangulo: ");
		double base = entrada.nextDouble();

		System.out.print("digite o valor da altura do triangulo: ");
		double altura = entrada.nextDouble();

		double area = (base * altura / 2);

		System.out.printf("\na area do triangulo é: %.2f", area);

		entrada.close();

	}

}
