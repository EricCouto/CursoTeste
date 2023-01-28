package classe;

public class Data {

	int dia;
	String mes;
	int ano;

	String organizarData() {

		return String.format("%d/%s/%d",dia, mes, ano);

	}

}
