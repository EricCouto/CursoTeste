package excecao.personalizadaA;

@SuppressWarnings("serial")
public class NumeroForadoIntervaloException extends RuntimeException {
	private String nomedoAtributo;

	public NumeroForadoIntervaloException(String nomedoAtributo) {
		this.nomedoAtributo = nomedoAtributo;

	}

	public String getMessage() {
		return String.format("O atributo '%s' está fora do intervalo", nomedoAtributo);
	}

}
