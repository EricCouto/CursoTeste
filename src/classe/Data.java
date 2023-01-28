package classe;

public class Data {

	int dia;
	String mes;
	int ano;

//mais flexivel para ser usada em outros contextos
	String organizarData() {
		return String.format("%d/%s/%d", dia, mes, ano);
	}

	void imprimirData() {
		System.out.println(organizarData());
	}

}
