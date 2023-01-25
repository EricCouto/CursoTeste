package fundamentos;

import java.util.Scanner;
import java.util.Locale;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Locale.setDefault(new Locale("en", "US"));
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite seu primeiro salario");
		String sal1 = entrada.nextLine().replace(",", ".");
		
		System.out.println("digite seu segundo salario");
		String sal2 = entrada.nextLine().replace(",", ".");
		
		System.out.println("digite seu terceiro salario");
		String sal3 = entrada.nextLine().replace(",", ".");// utilizei o replace por a entrada ser lida como String 
														   // assim substituindo a virgula por ponto
		double salario1 = Double.parseDouble(sal1);
		double salario2 = Double.parseDouble(sal2);
		double salario3 =  Double.parseDouble(sal3); // conversao de String para double
		
		double soma = salario1 + salario2 + salario3;
		System.out.println("a media é: "+ soma/3);
		entrada.close();
	}
 
}
