package excecao.personalizadaB;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException {
	private String nomedoAtributo;

	public StringVaziaException(String nomedoAtributo) {
		this.nomedoAtributo = nomedoAtributo;

	}

	public String getMessage() {
		return String.format("O atributo '%s' está vazio", nomedoAtributo);
	}

}
