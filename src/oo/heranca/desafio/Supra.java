package oo.heranca.desafio;

public class Supra extends Carro {

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
