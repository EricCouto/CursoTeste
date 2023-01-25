package fundamentos;

public class CalcTemperatura {
	public static void main(String[] args) {
		final double CALC = 5 / 9.0; // constante	
		final int AJUSTE = 32; // constante
		double f = 86.0; 
		double c = ((f - AJUSTE) * CALC);
		System.out.println(" em celsius o resultado ficou º"+c+ "  celcius");
		
		// reaplicando o calculo mudando os valores
		f = 150 ;
		c = ((f - AJUSTE) * CALC);
		System.out.println(" em celsius o resultado ficou º"+c+ "  celcius 'segundo calculo'");

	}

}
