package oo.heranca.desafio;

public class Teste {

	public static void main(String[] args) {

		Carro u1 = new Uno();

		Carro s2 = new Supra();

//		u1.velocidade = 21;
//		s2.velocidade = 45;

		u1.acelerar();
		u1.acelerar();

		System.out.println(u1);

		u1.freiar();
		u1.freiar();
		u1.freiar();
		u1.freiar();
		u1.freiar();
		u1.freiar();
		u1.freiar();
		u1.freiar();
		u1.freiar();
		System.out.println(u1);
		u1.acelerar();
		System.out.println(u1);

		System.out.println();

		s2.acelerar();
		s2.acelerar();
		s2.acelerar();
		System.out.println(s2);

		s2.freiar();
		s2.freiar();
		s2.freiar();
		s2.freiar();
		System.out.println(s2);

		s2.freiar();
		s2.freiar();
		s2.acelerar();
		System.out.println(s2);

	}

}
