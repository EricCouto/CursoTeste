package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("digite o primeiro numero: ");
		double variavel1 = entrada.nextDouble();

		System.out.print("\ndigite o segundo numero: ");
		double variavel2 = entrada.nextDouble();

		System.out.print("\ndigite o operador:  ");
		String operador = entrada.next().trim();
		
		double resultado ="+".equals(operador) ? variavel1  + variavel2 : 0;
		resultado = "-".equals(operador) ? variavel1 - variavel2 : resultado;
		resultado = "*".equals(operador) ? variavel1 * variavel2 : resultado;
		resultado = "/".equals(operador) ? variavel1 / variavel2 : resultado;
		resultado = "%".equals(operador) ? variavel1 % variavel2 : resultado;
		
		System.out.printf("\n %.2f %s %.2f = %.2f" , variavel1 ,operador , variavel2, resultado );
		
		entrada.close(); 

	}

}
