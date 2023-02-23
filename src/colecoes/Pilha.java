package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		Deque<String> livros = new ArrayDeque<>();

		livros.add("eragon");
		livros.push("pequeno principe");
		livros.push("o hobbit");

		System.out.println(livros.element());
		System.out.println(livros.peek());
		System.out.println();

		for (String livro : livros) {
			System.out.println(livro);

		}
		System.out.println();
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.pop());
		System.out.println(livros.remove());

		// livros.contains();
		// livros.size();
		// livros.isEmpty();
		// livros.clear();

	}

}
