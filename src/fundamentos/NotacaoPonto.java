package fundamentos;

public class NotacaoPonto {
	public static void main(String[] args) {
		double a = 2.3;
		System.out.println(a);

		// operador "." usado pq é Uma palavra do java String

		String s = "Bom dia x";
		s.toUpperCase();
		System.out.println(s);

		s = s.toUpperCase();
		System.out.println(s);

		s = s.replace("X", "senhora");
		System.out.println(s);

		s = s.toUpperCase();
		System.out.println(s);

		s = s.concat("!!!");
		System.out.println(s);

		System.out.println("Eric".toUpperCase());

		String y = "Bom dia X"
				.replace("X", "Eric")
				.toUpperCase()
				.concat("?!?!?!")
				;

		System.out.println(y);

		// tipos primitivos nao tem operador "."
	}

}
