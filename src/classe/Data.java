package classe;

public class Data {

	int dia;
	String mes;
	int ano;

	Data() {
		// dia = 01;
		// mes = "janeiro";
		// ano = 1970;
		this(1, "janeiro", 1970);

	}

	Data(int dia, String mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;

	}

	// mais flexivel para ser usada em outros contextos
	String organizarData() {
		String formato = "%d/%s/%d";
		return String.format(formato, dia, mes, ano);
	}

	void imprimirData() {
		System.out.println(organizarData());
	}

}
