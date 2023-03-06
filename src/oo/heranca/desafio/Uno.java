package oo.heranca.desafio;

public class Uno extends Carro {
	@Override
	void acelerar() {
		if (velocidade >= 0) {
			velocidade += 10;
		}
	}

	@Override
	void freiar() {
		if (velocidade > 0) {
			velocidade -= 10;
		}

	}

}
