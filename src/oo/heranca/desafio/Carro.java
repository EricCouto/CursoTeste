package oo.heranca.desafio;

public class Carro {
	final int VELOCIDADE_MAXIMA;
	double velocidade;
	int delta = 5;

	Carro(int velocidadeMaxima) {
		VELOCIDADE_MAXIMA = velocidadeMaxima;

	}

	void acelerar() {
		if (velocidade + delta > VELOCIDADE_MAXIMA) {
			velocidade = VELOCIDADE_MAXIMA;
		} else {
			velocidade += delta;
		}
	}

	void freiar() {
		if (velocidade > 0) {
			velocidade -= delta;
		}

	}

	public String toString() {
		return "velocidade atual é " + velocidade + "Km/h.";
	}
}
