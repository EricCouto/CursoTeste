package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a = 1;
		int b = 2;
		 
		
		//a++ = a = a + 1;
		//b-- = b = b - 1;
		System.out.println(a);
		System.out.println(b);
		
		a++;
		b--;
		System.out.println(a);
		System.out.println(b);
		 
		++b;
		--a; 
		
		System.out.println("mini desafio...");
		System.out.println(++a == b-- );
		System.out.println(a);
		System.out.println(b);
		System.out.println(a == b);
		
	}

}
