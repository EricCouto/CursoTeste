package controle;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		System.out.println("digite a media: ");
		double media = entrada.nextDouble();

		if (media > 10 || media < 0) {
			System.out.println("valor invalido");
		} else if (media > 7 && media <= 10) {
			System.out.println("aprovado");
		} else if (media < 7 && media > 4.5) {

			System.out.println("recuperação");

		} else
			System.out.println("reprovado");
		entrada.close();

	}

}
