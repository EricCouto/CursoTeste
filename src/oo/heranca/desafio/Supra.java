package oo.heranca.desafio;

public class Supra extends Carro {

	Supra(int velocidadeMaxima) {
		super(velocidadeMaxima);
		delta = 15;
	}

	@Override
	void acelerar() {
		super.acelerar();
		super.acelerar();
		super.acelerar();
	}

	@Override
	void freiar() {
		super.freiar();
		super.freiar();
		super.freiar();
	}
}
