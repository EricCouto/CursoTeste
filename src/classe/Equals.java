package classe;

import java.util.Date;

public class Equals {

	public static void main(String[] args) {
		Usuario u1 = new Usuario();
		u1.nome = "pedro";
		u1.email = "pedro.silva@email.com";

		Usuario u2 = new Usuario();
		u2.nome = "pedro";
		u2.email = "pedro.silva@email.com";
		
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));

		System.out.println(u2.equals(new Date()));
	}
//hashcode ainda não abordado
}
