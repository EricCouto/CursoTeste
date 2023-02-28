package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {

		Compra compra1 = new Compra();
		compra1.adicionarItem("Manga", 23.95, 5);
		compra1.adicionarItem(new Produto("Bottom", 6.75), 17);

		Compra compra2 = new Compra();
		compra2.adicionarItem("Livro", 73.95, 5);
		compra2.adicionarItem(new Produto("Caneta", 6.75), 10);

		Cliente cliente = new Cliente("joão Lucas");
		cliente.compras.add(compra1);
		cliente.adicionarCompra(compra2);

		System.out.println(cliente.ValorTotal());

		System.out.println(compra1.ValorCompra());
		System.out.println(compra2.ValorCompra());
	}

}
