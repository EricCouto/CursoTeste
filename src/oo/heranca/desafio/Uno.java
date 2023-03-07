package oo.heranca.desafio;

public class Uno extends Carro {
	public Uno() {
		super(220);
	}

	@Override
	public void acelerar() {
		if (velocidade >= 0) {
			velocidade += 10;
		}
	}

	@Override
	public void freiar() {
		if (velocidade > 0) {
			velocidade -= 10;
		}

	}

}
