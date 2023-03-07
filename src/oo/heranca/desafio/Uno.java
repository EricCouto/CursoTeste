package oo.heranca.desafio;

public class Uno extends Carro {
	Uno(){
		super(220);
	}
	
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
