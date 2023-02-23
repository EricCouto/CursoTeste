package colecoes;

import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		// Set<String> listaAprovados = new TreeSet<>();
		SortedSet<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");

		for (String candidato : listaAprovados) {
			System.out.println(candidato);

		}
		Set<Integer> nums = new TreeSet<>();
		nums.add(1000);
		nums.add(1);
		nums.add(5);
		nums.add(10);

		// nums.get(1); não é possivel acessar prlo indice

		for (int inteiro : nums) {
			System.out.println(inteiro);

		}
	}

}
