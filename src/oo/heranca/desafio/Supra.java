package oo.heranca.desafio;

public class Supra extends Carro {

	public Supra(int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 15;
	}

	@Override
	public void acelerar() {
		super.acelerar();
		super.acelerar();
		super.acelerar();
	}

	@Override

	public void freiar() {
		super.freiar();
		super.freiar();
		super.freiar();
	}
}
