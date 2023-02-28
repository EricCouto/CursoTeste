package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	final List<Item> itens = new ArrayList<>();

	void adicionarItem(Produto p, int quantidade) {
		this.itens.add(new Item(quantidade, p));

	}
	
	void adicionarItem(String nome,double preco, int quantidade) {
		var produto = new Produto(nome,preco);
		this.itens.add(new Item(quantidade, produto));
		
	}

	double ValorCompra() {
		double valor = 0;

		for (Item item : itens) {
			valor += (item.quantidade * item.produto.preco);
		}

		return valor;
	}

}
