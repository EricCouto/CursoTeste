package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {

		Aluno a0 = new Aluno("eric", 7.0);
		Aluno a1 = new Aluno("ana", 7.5);
		Aluno a2 = new Aluno("liz", 6.5);
		Aluno a3 = new Aluno("gui", 7.5);
		Aluno a4 = new Aluno("lucas", 8.5);
		Aluno a5 = new Aluno("assis", 7.5);
		Aluno a6 = new Aluno("assis", 7.5);
		Aluno a7 = new Aluno("liz", 6.5);
		Aluno a8 = new Aluno("yan", 7.5);
		Aluno a9 = new Aluno("lucas", 8.5);

		List<Aluno> alunos = Arrays.asList(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9);

		System.out.println("distinct ...");
		alunos.stream().distinct().forEach(System.out::println);

		System.out.println("\nSkip/Limit");
		alunos.stream()
		.distinct()// não duplicar nescessario o hash e equals para funcionar corretamente
		.skip(3) // pula elementos
		.limit(3)// limita o numero de elementos 
		.forEach(System.out::println);
		
		System.out.println("\nTake/While");
		alunos.stream()
		.distinct()
		.skip(3)
		.takeWhile(a -> a.nota >= 7.0)//vai pegar os alunos enquanto estiverem aprovados 
		.forEach(System.out::println);

	}

}
