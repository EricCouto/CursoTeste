package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		Jogador monstro = new Monstro();

		monstro.x = 10;
		monstro.y = 20;

		monstro.andar(Direcao.NORTE);

		System.out.println(monstro.x);
		System.out.println(monstro.y);
		System.out.println("a vida do monstro é" + monstro.vida);

		Heroi heroi = new Heroi();

		heroi.x = 10;
		heroi.y = 20;

		System.out.println(heroi.x);
		System.out.println(heroi.y);
		System.out.println("a vida do heroi é" + heroi.vida);
		System.out.println();
		
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		
		monstro.andar(Direcao.NORTE);
		heroi.atacar(monstro);
		monstro.atacar(heroi);

		System.out.println("a vida do monstro é " + monstro.vida);
		System.out.println("a vida do heroi é " + heroi.vida);
	}

}
