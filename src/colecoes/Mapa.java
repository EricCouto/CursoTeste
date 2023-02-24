package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();

		usuarios.put(1, "roberto");
		usuarios.put(10, "Ricardo");
		usuarios.put(20, "Roberta");
		usuarios.put(3, "Rebeca");
		usuarios.put(4, "Rafaela");

		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());

		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		System.out.println();

		System.out.println(usuarios.containsKey(4));
		System.out.println(usuarios.containsValue("Roberta"));

		System.out.println(usuarios.get(3));
		System.out.println(usuarios.remove(1));
		System.out.println(usuarios.remove(3, "Ricardo"));
		System.out.println();

		for (int chave : usuarios.keySet()) {
			System.out.println(chave);

		}

		System.out.println();
		for (String valores : usuarios.values()) {
			System.out.println(valores);

		}

		System.out.println();
		for (Entry<Integer, String> registro : usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ");
			System.out.println(registro.getValue());

		}

	}

}
