package streams;

public class Media {

	private double total;
	private int quantidade;

	public Media adicionar(double nota) {
		total += nota;
		quantidade++;

		return this;
	}

	public double valorMedia() {
		return total / quantidade;
	}

	public static Media combinar(Media m1, Media m2) {
		Media resultado = new Media();
		resultado.total = m1.total + m2.total;
		resultado.quantidade = m1.quantidade + m2.quantidade;

		return resultado;

	}

//	public double getTotal() {
//		return total;
//	}
//	public void setTotal(double total) {
//		this.total = total;
//	}
//	
//	public int getQuantidade() {
//		return quantidade;
//	}
//	public void setQuantidade(int quantidade) {
//		this.quantidade = quantidade;
//	}

}
