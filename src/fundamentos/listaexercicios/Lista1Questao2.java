package fundamentos.listaexercicios;

import java.util.Scanner;

public class Lista1Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Q2 Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
		

		final double CALC = 1.8; // constante
		final int AJUSTE = 32; // constante

		Scanner entrada = new Scanner(System.in);

		System.out.print("digite a temperatura em celsius para converter:	");
		double c = entrada.nextDouble();

		double f = (c * (CALC) + AJUSTE);

		System.out.printf("\nem  Fahrenheit o resultado ficou º %.2f ", f);

		entrada.close();

	}
//40 x 9 = 5(TF – 32)
}
