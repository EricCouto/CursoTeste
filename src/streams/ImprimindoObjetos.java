package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "ana");

		System.out.println("for tradicional...");
		for (int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i)); // usando for tradicional para imprimir
		}

		System.out.println("usando foreach...");
		for (String nome : aprovados) {
			System.out.println(nome); // utilizando foreach para imprimir
		}

		System.out.println("utilizando o iterator... ");
		Iterator<String> it = aprovados.iterator();

		while (it.hasNext()) {
			System.out.println(it.next()); // imprimindo usando iterator

		}
System.out.println("usando Stream...");
		Stream<String> st = aprovados.stream();
		st.forEach(System.out::println); //printando com Stream

	}

}
