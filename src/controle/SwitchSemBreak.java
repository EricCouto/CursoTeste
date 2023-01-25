package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {
		String faixa = "branca";

		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("sei o bassai-dai...");
		case "marrom":
			System.out.println("sei o Tekki Shodan");
		case "roxa":
			System.out.println("sei o Heian Godan");
		case "verde":
			System.out.println("sei o Heian Yodan");
		case "laranja":
			System.out.println("sei o Heian Sandan");
		case "vermelha":
			System.out.println("sei o Heian Nidan");
		case "amarela":
			System.out.println("sei o Heian Shodan");
			break;
		default:
			System.out.println("não sei nada");

		}

		System.out.println("\n Fim");

	}

}
