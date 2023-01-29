package classe;

public class DataTeste {

	public static void main(String[] args) {

		Data aleatoria = new Data();

		System.out.printf("%d/%s/%d \n\n", aleatoria.dia, aleatoria.mes, aleatoria.ano);

		aleatoria.dia = 27;
		aleatoria.mes = "Março";
		aleatoria.ano = 1986;

		Data aniversario = new Data(12, "Janeiro", 1994);

		String niver = aniversario.organizarData();

		System.out.println(niver);
		System.out.println(aleatoria.organizarData() + "\n\n");

		aleatoria.imprimirData();
		aniversario.imprimirData();

	}

}
