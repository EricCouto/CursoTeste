package oo.heranca.desafio;

public class Carro {
	public final int VELOCIDADE_MAXIMA;
	protected double velocidade;
	private int delta = 5;

	protected Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;

	}

	public void acelerar() {
		if (velocidade + getDelta() > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
		} else {
			velocidade += getDelta();
		}
	}

	public void freiar() {
		if (velocidade > 0) {
			velocidade -= delta;
		}

	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}

	public String toString() {
		return "velocidade atual é " + velocidade + "Km/h.";
	}

}
