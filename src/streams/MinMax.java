package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("ana", 7.5);
		Aluno a2 = new Aluno("liz", 6.5);
		Aluno a3 = new Aluno("gui", 7.5);
		Aluno a4 = new Aluno("lucas", 8.5);
		Aluno a5 = new Aluno("eric", 7.0);

		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5);

		Comparator<Aluno> melhorNota = (al1, al2) -> {
			if (al1.nota > al2.nota)	return 1;
				else if (al1.nota < al2.nota) return -1;
			return 0;
		};

		Comparator<Aluno> piorNota = (al1, al2) -> {
			if (al1.nota > al2.nota)	return -1;
				else if (al1.nota < al2.nota) return 1;
			return 0;
		};

		System.out.println(alunos.stream().max(melhorNota).get());
		System.out.println(alunos.stream().min(melhorNota).get());

		System.out.println(alunos.stream().max(piorNota).get());
		System.out.println(alunos.stream().min(piorNota).get());
	}

}
