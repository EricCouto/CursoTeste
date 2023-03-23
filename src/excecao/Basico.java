package excecao;


public class Basico {

	public static void main(String[] args) {
		
		Aluno a1 = null;
		try {
				imprimirNomedoAluno(a1);
		} catch (Exception e) {
			System.out.println("erro ao imprimir o nome");
		}
		
	
		
		try {
			System.out.println(7 / 0);
		} catch (Exception e) {
			System.out.println("ocorreu um erra: "+e.getMessage());
			//e.printStackTrace();
		}

		System.out.println("fim!!");

	}
	
	public static void imprimirNomedoAluno(Aluno aluno) {
		System.out.println(aluno.nome);
		
	}

}
