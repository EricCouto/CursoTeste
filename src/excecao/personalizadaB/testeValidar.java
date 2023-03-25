package excecao.personalizadaB;

import excecao.Aluno;

public class testeValidar {

	public static void main(String[] args) {

		try {
			Aluno a1 = new Aluno("  ", 7);
			Validar.aluno(a1);
			
			Validar.aluno(null);
		} catch (StringVaziaException e) {

			System.out.println(e.getMessage());
		} catch (NumeroForadoIntervaloException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Fim !!!");

	}

}
