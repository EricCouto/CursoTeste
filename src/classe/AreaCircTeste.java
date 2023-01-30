package classe;

public class AreaCircTeste {

	public static void main(String[] args) {

		AreaCirc circ = new AreaCirc(10);
		// circ.pi = 10;

		AreaCirc circ2 = new AreaCirc(5);
		// circ2.pi = 0;
		// AreaCirc.pi = 3.1415;
		System.out.println(circ.area());
		/*
		 * o PI com final se tornou uma constante podendo apenas ser lida não alterada e
		 * a palavra satic prende a variavel ou o metodo a classe mas podendo ser
		 * modificada
		 */
//		AreaCirc.pi = 3;
		System.out.println(circ2.area());

		System.out.println(AreaCirc.area(5.6));// usando metodo estatico
		System.out.println(AreaCirc.PI);// mostrando variavel constante
		System.out.println(Math.PI);// chamando metodos sem instaciar
	}

}
