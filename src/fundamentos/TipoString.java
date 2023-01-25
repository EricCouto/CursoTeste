package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("olá oessoal".charAt(2));

	
		
		String S = "bom dia";
		S =  S.toUpperCase();//muda tudo para maiusculo 		
		
		System.out.println(S.startsWith("bom"));
		System.out.println(S.startsWith("BOM"));
		
		System.out.println(S + "!!!");//concatena
		System.out.println(S.concat("!?!?!"));// concatena
		
//		System.out.println(S.toLowerCase());// muda tudo para minusculo 
		System.out.println(S.toLowerCase().startsWith("bom"));
		System.out.println(S.toLowerCase().startsWith("BOM"));
		
		//quantidade de caracteris 
		System.out.println(S.length());
	
	System.out.println(S.equals("bom dia"));
	System.out.println(S.equalsIgnoreCase("bom dia"));
	
	var nome = "pedro";
	var sobrenome = "sampaio";
	var idade= 33;
	var salario = 12345.987;
	
	System.out.println("nome "+nome+"\nsobrenome "+sobrenome+"\nidade "+idade+"\nsalario "+salario);
	
	System.out.printf("o senhor %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade,salario);
	
	String frase = String.format("\no senhor %s %s tem %d anos e ganha R$%.2f", nome, sobrenome, idade,salario);
	System.out.println(frase);
	
	
	
	}

}
