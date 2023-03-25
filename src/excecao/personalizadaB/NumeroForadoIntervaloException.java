package excecao.personalizadaB;

@SuppressWarnings("serial")
public class NumeroForadoIntervaloException extends Exception {
	private String nomedoAtributo;

	public NumeroForadoIntervaloException(String nomedoAtributo) {
		this.nomedoAtributo = nomedoAtributo;

	}

	public String getMessage() {
		return String.format("O atributo '%s' está fora do intervalo", nomedoAtributo);
	}

}
