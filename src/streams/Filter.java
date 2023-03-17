package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Filter {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("ana", 6.0);
		Aluno a2 = new Aluno("lucas", 8.0);
		Aluno a3 = new Aluno("gui", 7.0);
		Aluno a4 = new Aluno("joao", 5.0);
		Aluno a5 = new Aluno("liz", 6.8);
		Aluno a6 = new Aluno("bia", 9.0);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6);

		Predicate<Aluno> aprovado = 
				a -> a.nota >= 7;
		Function<Aluno, String> parabens = 
				a -> "parabens " + a.nome + " vc foi aprovado !!";

		alunos.stream().filter(aprovado).map(parabens).forEach(System.out::println);
		
		System.out.println();

		alunos.stream()
		.filter(a -> a.nota >= 7).map(a -> "parabens " + a.nome + " vc foi aprovado !!").forEach(System.out::println);
		;

	}

}
