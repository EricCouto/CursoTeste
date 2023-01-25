package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("comprou a tv 50? " +comprouTV50);  
		System.out.println("comprou a tv 32? "+ comprouTV32);  
		System.out.println("comprou o sorvete? "+ comprouSorvete);  
		System.out.println("mais saudavel? "+ maisSaudavel);  
		
		

		/*
		 * System.out.print("comprou a tv 50: ");  
		 * System.out.println( trabalho1 && trabalho2 );
		 *  System.out.print("comprou tv 32: ");
		 *   System.out.println(trabalho1 ^ trabalho2 ); 
		 * System.out.print("tomou sorvete: ");
		 * System.out.println( trabalho1 || trabalho2 );
		 */

	}

}
