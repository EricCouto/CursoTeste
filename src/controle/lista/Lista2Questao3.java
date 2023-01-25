package controle.lista;

import java.util.Scanner;

public class Lista2Questao3 {

	public static void main(String[] args) {
		/*
		 * 3. Criar um programa que receba duas notas parciais, calcular a média final.
		 * Se a nota do aluno for maior ou igual a 7.0 imprime no console "Aprovado", se
		 * a nota for menor que 7.0 e maior do que 4.0 imprime no console
		 * "Recuperação", caso contrário imprime no console "Reprovado".
		 */

		Scanner entrada = new Scanner(System.in);
		System.out.println("escreva a primeira nota:	");
		double nota1 = entrada.nextDouble();
		System.out.println("escreva a segunda nota:		");
		double nota2 = entrada.nextDouble();
		
		boolean verificacao1 = nota1 >= 0 && nota1 <= 10;
		boolean verificacao2 = nota2 >= 0 && nota2 <= 10;		

		if (verificacao1 == true && verificacao2 == true) {
			double media = (nota1 + nota2) / 2;
			if (media >= 7) {
				System.out.println("aprovado, a media final foi de:	" + media);
			} else if (media >= 4 && media < 7) {
				System.out.println("recuperação, a media final foi de:	" + media);
			} else
				System.out.println("reprovado, a media final foi de:	" + media);
		} else
			System.out.println("nota invalida");
		
		entrada.close();
	}

}
