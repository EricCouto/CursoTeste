package classe;

public class Desafio {
	int a = 3;
	static int b = 5;

	public static void main(String[] args) {

		Desafio p = new Desafio();// por main ser static tive de instanciar um objeto do tipo desafio para poder
		System.out.println(p.a); // acessar a

		System.out.println(b);// acessou b pq o metodo main e b são static
	}

}
