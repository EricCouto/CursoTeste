package classe;

public class Data {

	int dia;
	String mes;
	int ano;

	Data() {
		
			dia = 01;
			mes = "janeiro";
			ano = 1970;
		
	}

	Data(int diaInit, String mesInit, int anoInit) {
		dia = diaInit;
		mes = mesInit;
		ano = anoInit;

	}

	// mais flexivel para ser usada em outros contextos
	String organizarData() {
		return String.format("%d/%s/%d", dia, mes, ano);
	}

	void imprimirData() {
		System.out.println(organizarData());
	}

}
