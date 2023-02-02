package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {

		double a = 2;
		double b = a;// atribuição por valor(tipo primitivo)
		a++;
		b--;
		System.out.println(a);
		System.out.println(b);

		Data d1 = new Data();
		Data d2 = d1;// atribuição por referencia (objeto)

		d1.dia = 31;
		d2.mes = "Março";

		System.out.println(d1.organizarData());
		System.out.println(d2.organizarData());

		voltarDataParaValorPadrao(d2);

		System.out.println(d1.organizarData());
		System.out.println(d2.organizarData());

		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	}

	static void alterarPrimitivo(int a) {
		a++;
	}

	static void voltarDataParaValorPadrao(Data d) {
		d.dia = 1;
		d.mes = "Janeiro";
		d.ano = 1970;

	}
}
