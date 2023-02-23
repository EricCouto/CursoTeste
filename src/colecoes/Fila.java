package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();

		/*
		 * add e offer adicionam a lista, mas eles são diferentes no comportamento
		 * quando a fila está cheia
		 */
		fila.add("anna");// lança uma exceção
		fila.offer("bia");// retorna false
		fila.add("carlos");
		fila.offer("daniel");
		fila.add("rafa");
		fila.offer("gui");

		// ambos obtem o proximo elemento sem remover, e mudam o comportamento quando a
		// fila esta vazia
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.element()); // lança exceção
		System.out.println(fila.peek());

		// ambos obtem o proximo elemento removendo, e mudam o comportamento quando a
		// fila esta vazia

		System.out.println(fila.poll()); // retorna null
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());// lança exceção

		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		// fila.contains(...)

	}

}
