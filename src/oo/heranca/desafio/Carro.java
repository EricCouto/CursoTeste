package oo.heranca.desafio;

public class Carro {
	public final int VELOCIDADE_MAXIMA;
	protected double velocidade;
	protected int delta = 5;

	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;

	}

	public void acelerar() {
		if (velocidade + delta > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
		} else {
			velocidade += delta;
		}
	}

	public void freiar() {
		if (velocidade > 0) {
			velocidade -= delta;
		}

	}

	public String toString() {
		return "velocidade atual é " + velocidade + "Km/h.";
	}
}
