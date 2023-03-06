package oo.heranca;

public class Monstro extends Jogador{

	boolean atacar(Jogador oponente) {
		int deltax = Math.abs(x - oponente.x);
		int deltay = Math.abs(y - oponente.y);

		if (deltax == 0 && deltay == 1) {
			oponente.vida -= 15;
		}else if(deltax == 1 && deltay == 0) {
			oponente.vida -= 15;

		}
		return true;
	}
	
}
