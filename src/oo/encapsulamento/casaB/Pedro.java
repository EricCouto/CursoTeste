package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

	void testeAcesso() {
//		segredo
//		facoDentrodeCasa
//		formadeFalar
//		todosSabem

		// Ana mae = new Ana();

		// System.out.println(mae.segredo); apenas ana tem acesso pro ser
		// privado(private)
		// System.out.println(mae.facoDentrodeCasa); apenas classes do mesmo pacotes tem
		// acesso no encapsulamento default
		System.out.println(formadeFalar);// para acessar esse tipo por ser uma herança não precisa criar
		// um objeto do tipo ana apenas o acessar por a classe pedro extender da classe
		// ana

		System.out.println(new Ana().todosSabem);// por ser publico todos podem ter acesso via herança ou objeto
	}

}
