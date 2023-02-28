package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
	final String nome;
	final ArrayList<Compra> compras = new ArrayList<>();

	Cliente(String nome) {
		this.nome = nome;
	}

	void adicionarCompra(Compra compra) {
		this.compras.add(compra);

	}

	double ValorTotal() {
		double precototal = 0;
		for (Compra compra : compras) {

			precototal += compra.ValorCompra();

		}
		return precototal;
	}
}
