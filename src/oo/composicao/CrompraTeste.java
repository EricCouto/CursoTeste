package oo.composicao;

public class CrompraTeste {

	public static void main(String[] args) {

		Compra c1 = new Compra();
		c1.cliente = "joão";

		c1.adicionarItem(new Item("caneta", 20, 7.45));
		c1.adicionarItem("borracha", 2, 3.45);
		c1.itens.add(new Item("lapis", 5, 1.45));

		System.out.println(c1.itens.size());
		System.out.println(c1.valorTotal());

	}

}
