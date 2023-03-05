package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		Jogador J1 = new Jogador();

		J1.x = 10;
		J1.y = 20;

		J1.andar(Direcao.NORTE);

		System.out.println(J1.x);
		System.out.println(J1.y);
		System.out.println(J1.vida);

		Jogador J2 = new Jogador();

		J2.x = 10;
		J2.y = 20;

		System.out.println(J2.x);
		System.out.println(J2.y);
		System.out.println(J2.vida);

		J2.atacar(J1);
		
		System.out.println(J1.vida);
		System.out.println(J2.vida);
	}

}
