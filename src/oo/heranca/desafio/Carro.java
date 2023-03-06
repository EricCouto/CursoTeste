package oo.heranca.desafio;

public class Carro {
	double velocidade;

	void acelerar() {
		if (velocidade >= 0) {
			velocidade += 5;
		}
	}

	void freiar() {
		if (velocidade > 0 ) {
			velocidade -= 5;
		}

	}
	
	public String toString() {
		return "velocidade atual é "+ velocidade+"Km/h.";
	}
}
