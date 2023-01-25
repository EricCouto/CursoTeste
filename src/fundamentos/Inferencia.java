package fundamentos;

public class Inferencia {
	public static void main(String[] args) {

		double a = 4.5; // declarou e inicializou a variavel
		System.out.println(a);

		var b = 5.0;
		System.out.println(b);
		/*
		 * variavel do tipo "VAR" o java ler a variavel e determina por ele mesmo o tipo
		 * da variavel, mas ela não muda o tipo dela. assim não recebe variavel de outro
		 * tipo. a variavel do tipo VAR precisa ser declarada e ao mesmo tempo
		 * inicializada
		 */
		var c = "eric";
		System.out.println(c);

		double d; // variavel declarada
		d = 125.5;// variavel inicializada
		System.out.println(d);// usada

		/*
		 * var e = 12;
		 *  e = 13.5
		 *  ; forma errada de utilização do Tipo VAR
		 *  
		 */
	}

}
