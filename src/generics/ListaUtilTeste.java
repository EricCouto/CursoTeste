package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

	public static void main(String[] args) {
		List<String> langs = Arrays.asList("JS", "PHP", "Java", "c++");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		String ultimaLinguagem1 = (String) ListaUtil.getListaUtil1(langs);
		System.out.println(ultimaLinguagem1);

		Integer ultimoInteiro1 = (Integer) ListaUtil.getListaUtil1(nums);
		System.out.println(ultimoInteiro1);

		String ultimaLinguagem2 = ListaUtil.getListaUtil2(langs);
		System.out.println(ultimaLinguagem2);

		Integer ultimoInteiro2 = ListaUtil.<Integer>getListaUtil2(nums);
		System.out.println(ultimoInteiro2);
	}

}
