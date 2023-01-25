package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		System.out.println("digite sair");
		String saida = entrada.next();

		while (!"sair".equalsIgnoreCase(saida)) {
			System.out.println("ainda dentro do while\n");
			System.out.println("digite sair:	");
			saida = entrada.nextLine();

		}
		entrada.close();
		System.out.println("fim!!");
	}

}
/*
 * int cont = 0; while(cont <= 20) { System.out.println("bom dia"); cont += 2; }
 */