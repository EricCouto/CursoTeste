package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// informacoes do funcionario
		
		// tipo numerico inteiro
		
		byte anosDeEmpresa = 23;// valor maximo 127
		short numeroDeVoos = 542;//valor maximo 32767
		int id = 56789; // valor 2 milhoes... 
		long pontosAcumulados = 3_134_845_223L;
		
		//tipo numerico flutuante
		
		float salario = 11_445.44F;
		double vendaAcumuladas = 2_991_797_103.01;
		
		// tipo booblean
		boolean estaDeFerias = false; //true
		
		//tipo caractere
		char status = 'A';
		
		//dias de empresa
		System.out.println(anosDeEmpresa * 365 + " foram os numeros de dias");
		 // numero de viagens
		System.out.println(numeroDeVoos / 2 + " numero de viagens realizadas");
		//pontos por real
		System.out.println(pontosAcumulados / vendaAcumuladas );
		// mostrando funcionario
		System.out.println(id+ " ganha "+ salario);
		// estado do funcionario
		System.out.println("ferias: "+ estaDeFerias);
		//ativo na empresa?
		System.out.println("Status: "+ status );
		
		
	}

}
