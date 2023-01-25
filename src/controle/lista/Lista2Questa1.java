package controle.lista;

import java.util.Scanner;

public class Lista2Questa1 {

	public static void main(String[] args) {

		/*
		 * 1. Criar um programa que receba um número e verifique se ele está entre 0 e
		 * 10 e é par;
		 */

		Scanner entrada = new Scanner(System.in);

		System.out.println("digite um número entre 0 a 10");
		int valor = entrada.nextInt();

		if (valor >= 0 && valor <= 10) {
			if (valor % 2 == 0)
				System.out.println("valor é par!!");

			System.out.println("valor é valido");

		} else {
			System.out.println("valor invalido");
		  }

		System.out.println("FIM!!!");

		entrada.close();

	}

}
