package streams;

public class MediaTeste {

	public static void main(String[] args) {
		Media prova = new Media().adicionar(8.5).adicionar(9.5);				
		System.out.println(prova.valorMedia());
		
		Media prova2 = new Media().adicionar(7.5).adicionar(6.5);
		System.out.println(prova2.valorMedia());
		
	System.out.println(Media.combinar(prova, prova2).valorMedia());
	
	}

}
