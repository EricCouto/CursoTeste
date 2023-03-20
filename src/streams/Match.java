package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("ana", 7.5);
		Aluno a2 = new Aluno("liz", 6.5);
		Aluno a3 = new Aluno("gui", 7.5);
		Aluno a4 = new Aluno("lucas", 8.5);
		Aluno a5 = new Aluno("eric", 7);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);

		Predicate<Aluno> aprovado = a -> a.nota >= 7;
		Predicate<Aluno> reprovado = aprovado.negate();
		
		System.out.println(alunos.stream().allMatch(aprovado));//todos aprovados 
		System.out.println(alunos.stream().anyMatch(aprovado));// algum aprovado 
		System.out.println(alunos.stream().noneMatch(aprovado));//ninguem aprovado
		System.out.println(alunos.stream().noneMatch(reprovado));// ninguem reprovado

	}

}
