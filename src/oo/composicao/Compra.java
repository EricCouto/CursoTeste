package oo.composicao;

import java.util.ArrayList;

public class Compra {

	String cliente;
	ArrayList<Item> itens = new ArrayList<>();

	void adicionarItem(String nome, int quantidade, double valor) {
		this.adicionarItem(new Item(nome, quantidade, valor));

	}

	void adicionarItem(Item item) {
		this.itens.add(item);
		item.compra = this;
	}

	double valorTotal() {
		double total = 0;

		for (Item item : itens) {
			total += item.quantidade * item.valor;

		}

		return total;
	}

}
