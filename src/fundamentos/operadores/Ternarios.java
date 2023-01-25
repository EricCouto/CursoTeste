package fundamentos.operadores;

public class Ternarios {
	public static void main(String[] args) {
		double media = 7.56;
		String resultado = media >= 7 ? "aprovado" : "em recuperação";
		
		System.out.println("o aluno está: "+resultado);
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultadoFinal = temDesconto? "sim": "não";
		
		System.out.println("tem desconto? "+ resultadoFinal);
		
	}

}
