package classe.desafio;

public class Jantar {

	public static void main(String[] args) {

		/**/
		Comida feijao = new Comida("feijão", 0.3);
		Comida arroz = new Comida("Arroz", 0.5);

		Pessoa p = new Pessoa("Eric", 107.3);

		System.out.printf("%s, %.2f\n\n", p.nome, p.peso);

		System.out.println(p.nome + " está jantando\n");
		p.comer(feijao);
		System.out.println(p.apresentar());
		
		System.out.println(p.nome + " está jantando\n");
		p.comer(arroz);		
		System.out.println(p.apresentar());

	}

}
