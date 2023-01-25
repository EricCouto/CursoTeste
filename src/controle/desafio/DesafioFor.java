package controle.desafio;

public class DesafioFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String valor = "#";
		for(int i = 1; i <=5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		//sem uso de valor numerico
		for(String i = "#"; !i.equals("#######"); i += "#") {
			System.out.println(i);
		}

	}

}
