package generics;

public class CaixaTeste {

	public static void main(String[] args) {
		Caixa<String> caixaA = new Caixa<>();
		caixaA.guardar("segredo!!");
		
		String coisa = caixaA.abrir();
		System.out.println(coisa);
		
	
		Caixa<Double> caixaB = new Caixa<>();
		caixaB.guardar(3.1415);
		
		Double coisaB = caixaB.abrir();
		System.out.println(coisaB);
	}

}
