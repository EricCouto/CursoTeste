package fundamentos.listaexercicios;

import java.util.Scanner;

public class Lista1Questao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Q1 Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
		

		final double CALC = 5 / 9.0; // constante
		final int AJUSTE = 32; // constante

		Scanner entrada = new Scanner(System.in);

		System.out.print("digite a temperatura em Fahrenheit para converter");
		double f = entrada.nextDouble();

		double c = ((f - AJUSTE) * CALC);

		System.out.printf(" em celsius o resultado ficou º %.2f ", c);

		entrada.close();

	}

}
