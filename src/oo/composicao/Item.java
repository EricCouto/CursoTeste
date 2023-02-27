package oo.composicao;

public class Item {

	String nome;
	int quantidade;
	double valor;
	Compra compra;

	Item(String nome, int quantidade, double valor) {
		this.nome = nome;
		this.quantidade = quantidade;
		this.valor = valor;
	}

}
