package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("ana", 7.5);
		Aluno a2 = new Aluno("liz", 6.5);
		Aluno a3 = new Aluno("gui", 7.5);
		Aluno a4 = new Aluno("lucas", 8.5);
		Aluno a5 = new Aluno("eric", 7);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);

		Predicate<Aluno> aprovado = a -> a.nota >= 7.5;
		Function<Aluno, Double> apenasNota = a -> a.nota;
		BiFunction<Media, Double, Media> calcularMedia = (media, nota) -> media.adicionar(nota);
		BinaryOperator<Media> combinarMedia = (m1, m2) -> Media.combinar(m1, m2);

		Media mediaAprovados = alunos.stream().filter(aprovado).map(apenasNota).reduce(new Media(), calcularMedia,
				combinarMedia);
		Media mediaTurma = alunos.stream().map(apenasNota).reduce(new Media(), calcularMedia, combinarMedia);

		System.out.printf("A media dos aprovados é " + mediaAprovados.valorMedia());
		System.out.println("\nA media da turma é " + mediaTurma.valorMedia());

	}

}
