package classe;

public class ValorNulo {

	public static void main(String[] args) {
		String s = "";
		System.out.println(s.concat("!!!!!!!!!"));

		Data d1 = Math.random() > 0.5 ? new Data() : null;

		if (d1 != null) {
			d1.dia = 5;
			System.out.println(d1.organizarData());
		} else
			System.out.println("nulo");

		String s2 = Math.random() > 0.5 ? "funcionou" : null;
		;

		if (s2 != null) {
			System.out.println(s2.concat("????????????"));
		} else
			System.out.println("nulo");

	}

}
