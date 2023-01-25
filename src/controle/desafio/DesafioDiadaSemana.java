package controle.desafio;

import java.util.Scanner;

public class DesafioDiadaSemana {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("digite o dia da semana");
		String dia = entrada.next();

		if ("domingo".equalsIgnoreCase(dia)) {
			System.out.println("1");
		} else if ("segunda".equalsIgnoreCase(dia)) {
			System.out.println("2");
		} else if ("terça".equalsIgnoreCase(dia) || "terca".equalsIgnoreCase(dia) ) {
			System.out.println("3");
		} else if ("quarta".equalsIgnoreCase(dia)) {
			System.out.println("4");
		} else if ("quinta".equalsIgnoreCase(dia)) {
			System.out.println("5");
		} else if ("sexta".equalsIgnoreCase(dia)) {
			System.out.println("6");
		} else if ("sabado".equalsIgnoreCase(dia) || "sábado".equalsIgnoreCase(dia)) {
			System.out.println("7");
		} else
			System.out.println("dia invalido");
		System.out.println("fim!!");
		entrada.close();
	}

}

/*
 * System.out.println("digite um numero inteiro entre 1 a 7 "); int dia =
 * entrada.nextInt();
 * 
 * if (dia > 7 || dia < 1) { System.out.println("valor invalido"); } else if
 * (dia == 1) { System.out.println("domingo"); } else if (dia == 2) {
 * System.out.println("segunda"); } else if (dia == 3) {
 * System.out.println("terça"); } else if (dia == 4) {
 * System.out.println("quarta"); } else if (dia == 5) {
 * System.out.println("quinta"); } else if (dia == 6) {
 * System.out.println("sexta"); } else System.out.println("sabado");
 */
