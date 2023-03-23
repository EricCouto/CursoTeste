package excecao;

public class ChecadaVsNaoChecada {

	public static void main(String[] args) {
		try {
			gerarErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
		}

		try {
			gerarErro2();
		} catch (Throwable e) {

			System.out.println(e.getMessage());
			// e.printStackTrace();
		}

		System.out.println("fim!!!");
	}

	// não checada || não verificada
	static void gerarErro1() {
		throw new RuntimeException("ocorreu um erro #01");
	}

//exceção chegada || verificada
	static void gerarErro2() throws Exception {
		throw new Exception("ocorreu um erro #02");

	}

}
