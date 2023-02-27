package oo.composicao;

public class CursoTeste {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("joão");
		Aluno aluno2 = new Aluno("ana");
		Aluno aluno3 = new Aluno("liz");

		Curso curso1 = new Curso("java");
		Curso curso2 = new Curso("python");
		Curso curso3 = new Curso("c++");

		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);

		curso2.adicionarAluno(aluno3);
		curso2.adicionarAluno(aluno1);

		aluno1.adiocionarCurso(curso3);
		aluno2.adiocionarCurso(curso3);
		aluno3.adiocionarCurso(curso3);

		for (Aluno aluno : curso1.alunos) {
			System.out.println("o aluno matriculado no curso de " + curso1.nome + " é " + aluno.nome);

		}

		System.out.println();

		for (Aluno aluno : curso2.alunos) {
			System.out.println("o aluno matriculado no curso de " + curso2.nome + " é " + aluno.nome);

		}

		System.out.println();

		for (Aluno aluno : curso3.alunos) {
			System.out.println("o aluno matriculado no curso de " + curso3.nome + " é " + aluno.nome);

		}

		System.out.println();
		System.out.println(aluno1.cursos.get(0).alunos);
		Curso cursoEncontrado = aluno1.obterCursoporNome("java");

		if (cursoEncontrado != null) {

			System.out.println(cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		}

	}

}
