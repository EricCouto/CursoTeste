package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<Usuario> usuarios = new HashSet<>();
		
		usuarios.add(new Usuario("pedro"));
		usuarios.add(new Usuario("ana"));
		usuarios.add(new Usuario("rafael"));
		usuarios.add(new Usuario("guilherme"));
		
		boolean resultado = usuarios.contains(new Usuario("rafael"));
		
		System.out.println(resultado);
		
		//System.out.println(usuarios.contains(new Usuario("rafael")));
	}

}
