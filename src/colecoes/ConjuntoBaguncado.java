package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();

		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("teste");

		conjunto.add(10);
		conjunto.add("x");

		System.out.println(conjunto.size());
		conjunto.add("teste");

		System.out.println(conjunto.size());

		conjunto.add("Teste");

		System.out.println(conjunto.size());

		conjunto.remove("teste");
		conjunto.remove("y");
		conjunto.remove(1.2);

		System.out.println(conjunto.size());
		System.out.println(conjunto.contains(1.2));
		System.out.println(conjunto.contains("x"));

		Set nums = new HashSet();
	
	nums.add(1);
	nums.add(2);
	nums.add(3);
	
	System.out.println(nums);
	System.out.println(conjunto);
	
	conjunto.addAll(nums);//uniao entre dois conjuntos
	System.out.println(conjunto);
	
	conjunto.retainAll(nums);
	System.out.println(conjunto);
	System.out.println(nums);
	
	conjunto.clear();
	System.out.println(conjunto);
	}

}
