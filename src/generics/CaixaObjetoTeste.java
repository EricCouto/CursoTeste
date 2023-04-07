package generics;

public class CaixaObjetoTeste {

	public static void main(String[] args) {
		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guardar(2.3);

		Double coisa = (Double) caixaA.abrir();
		System.out.println(coisa); // o modo correto para fazer a leitura

//		Integer coisa = (Integer) caixaA.abrir();
//		System.out.println(coisa); não funciona por caixaA ser tipo objeto
//		precisando assim de forma explicita colocar um cast  de forma manual e do tipo correto

		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guardar("ola !!!");

		String coisaB = (String) caixaB.abrir();
		System.out.println(coisaB);
	}

}
