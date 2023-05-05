package jdbc;

public class Pessoa {

	private int coodigo;
	private String nome;

	public Pessoa(int codigo, String nome) {
		this.coodigo = codigo;
		this.nome = nome;
	}

	public int getCoodigo() {
		return coodigo;
	}

	public void setCoodigo(int coodigo) {
		this.coodigo = coodigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
