package controle.desafio;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		double nota = 0;
		int cont = 0;
		double media = 0;

		while (nota != -1) {
			System.out.println("digite a nota: ");
			nota = entrada.nextDouble();

			if (nota <= 10 && nota >= 0) {

				media += nota;
				cont++;
			} else if (nota != -1) {

				System.out.println("nota invalida");
			}
		}
		double total = media / cont;
		System.out.println(" a media é: " + total);
		entrada.close();
	}
}
