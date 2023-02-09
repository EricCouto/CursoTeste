package fundamentos.operadores;

public class Logicos {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean condicao1 = true;
		boolean  condicao2 = 3 > 7;
		System.out.println(condicao1 && condicao2);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao1 ^ condicao2);
		System.out.println(condicao1 && !condicao2);
		System.out.println(!condicao1);
		System.out.println(!condicao2);
		
		
		
		System.out.println("\n\ntabela verdade do 'E':	");
		System.out.println(true && true);
		System.out.println(true && false);
		System.out.println(false && true);
		System.out.println(false && false);
		
		System.out.println("\ntabela verdade do 'ou':	");
		System.out.println(true || true);
		System.out.println(true || false);
		System.out.println(false || true);
		System.out.println(false || false);
		
		System.out.println("\ntabela verdade do 'xor':	");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		System.out.println("\n tabela verdade do 'NOT':	");
		System.out.println(!true);
		System.out.println(!false);
		
		
	}

}
