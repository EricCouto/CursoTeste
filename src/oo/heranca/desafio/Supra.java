package oo.heranca.desafio;

public class Supra extends Carro implements Esportivo, Luxo {

	boolean turbo = false;
	boolean arCondicionado = false;

	public Supra(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setDelta(15);
	}

	@Override
	public void ligarAr() {
		arCondicionado = true;

	}

	@Override
	public void desligarAr() {
		arCondicionado = false;
	}

	@Override
	public void ligarTurbo() {
		turbo = true;

	}

	@Override
	public void desligarTurbo() {
		turbo = false;
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

	@Override
	public int getDelta() {
		if (turbo && !arCondicionado)
			return 35;
		else if (turbo && arCondicionado)
			return 30;
		else if (!turbo && !arCondicionado)
			return 20;
		else
			return 15;

	}
}
