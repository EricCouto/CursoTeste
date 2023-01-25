package fundamentos.listaexercicios;

import java.util.Scanner;

public class Lista1Quetsao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Q4 Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.


		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("digite o numero que deseja calcular: ");
		double variavel = entrada.nextDouble();
		
		double quadrado = Math.pow(variavel, 2);
		double cubo = Math.pow(variavel, 3);
		
		System.out.printf("o valor elevado ao quadrado é: %.2f e ao cubo é: %.2f", quadrado, cubo);

		entrada.close();
	}

}
