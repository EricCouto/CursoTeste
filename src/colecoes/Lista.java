package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();

		Usuario u1 = new Usuario("ana");

		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("lia"));
		lista.add(new Usuario("bia"));
		lista.add(new Usuario("mia"));

		System.out.println(lista.get(0));
		System.out.println(lista.get(1));// acessando pelo indice
		System.out.println(lista.get(2));
		System.out.println(lista.get(3));
		System.out.println(lista.get(4));

		System.out.println();
		System.out.println(lista.remove(1));
		System.out.println(lista.remove(new Usuario("mia")));
		System.out.println(lista.contains(new Usuario("lia")));
		System.out.println(lista.contains(new Usuario("manu")));

		for (Usuario u : lista) {
			System.out.println(u.nome);

		}

	}

}
