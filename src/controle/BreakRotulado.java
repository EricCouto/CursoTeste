package controle;

public class BreakRotulado {

	public static void main(String[] args) {

		// o externo está dando nome ao bloco do "for i"
		externo: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == 1) {
					break externo;
				}
				System.out.printf("[%d, %d]", i, j);
			}
			System.out.println();
		}
		
		System.out.println("\nSegundo for\n");
		
		//o break está parando o laço interno no caso o for com J
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == 1) {
					break;
				}
				System.out.printf("[%d, %d]", i, j);
			}
			System.out.println();
		}

	}

}
