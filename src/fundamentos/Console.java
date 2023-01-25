package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("bom");
		System.out.print(" dia!\n");

		System.out.println("bom");// um print que logo em seguida pula uma linha
		System.out.println("dia!\n");

		System.out.printf("megasena: %d %d %d %d %d %d\n", 1, 2, 3, 4, 5, 6);

		System.out.printf("salario: %.2f%n", 1234.5678);// um jeito de mostrar formatado
		System.out.printf("nome: %s\n", "lucas");

		Scanner entrada = new Scanner(System.in);// esta lendo oq é digitado no teclado

		System.out.print("digite seu nome: ");
		String nome = entrada.nextLine();

		System.out.print("digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();// forma de ler String do teclado

		System.out.print("digite sua idade: ");// forma de ler inteiro do teclado
		int idade = entrada.nextInt();

		System.out.printf("\n%s %s tem idade de %d anos: \n", nome, sobrenome, idade);
		entrada.close();// fechando o scaner se não vai continuar rodando consumindo processamento

		/*
		 * Scanner teclado2 = new Scanner(System.in);
		 * 
		 * System.out.println("Qual a sua idade?"); int idade2 =
		 * teclado2.nextInt();//dessa forma fica para trá um \n no buffer
		 * System.out.println("Qual o seu nome?"); String nome2 =
		 * teclado2.nextLine();//o \n é lido aqui pulando assim o nome que ficara vazio
		 * ou dando erro
		 * 
		 * System.out.println("Qual o seu sobrenome?"); String sobrenome2 =
		 * teclado2.nextLine();
		 * 
		 * System.out.printf("\n%s %s tem idade de %d anos: ", nome2, sobrenome2,
		 * idade2);
		 * 
		 * teclado2.close();
		 */

		/*
		 * Scanner teclado3 = new Scanner(System.in);
		 * 
		 * System.out.println("Qual a sua idade?"); int idade3 = teclado3.nextInt();
		 * teclado3.nextLine(); // lê o "\\\\n" que o teclado.nextInt() deixa para trás.
		 * System.out.println("Qual o seu nome?"); String nome3 = teclado3.nextLine();
		 * System.out.println("Qual o seu sobrenome?"); String sobrenome3 =
		 * teclado3.nextLine();
		 * 
		 * System.out.printf("\n%s %s tem idade de %d anos: ", nome3, sobrenome3,
		 * idade3);
		 * 
		 * teclado3.close();
		 */

	}

}
