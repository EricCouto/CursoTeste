package lambdas;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	// #1-- A partir do produto calcular preco real (com desconto)
	// #2-- imposto municipal: >= 2500(8.5%)/ < 2500 (isento)
	// #3-- frete: >= 3000(100)/ <3000(50)
	// #4-- arredondar: deixar duas casas decimais
	// #5-- formatar: R$1234,56

	public static void main(String[] args) {

		Function<Produto, Double> comDesconto = valor -> valor.desconto * valor.preco;

		UnaryOperator<Double> imposto = valorImposto -> valorImposto >= 2500 ? valorImposto * 1.085 : valorImposto;

		UnaryOperator<Double> frete = valorFrete -> valorFrete >= 3000 ? valorFrete + 50 : valorFrete + 100;

		UnaryOperator<Double> arredondar = valorArredondado -> BigDecimal.valueOf(valorArredondado)
				.setScale(2, RoundingMode.UP).doubleValue();

		Function<Double, String> formatado = valorFinal -> ("R$" + valorFinal).replace(".", ",");

		Produto p = new Produto("celular", 10000.8765, 0.95);

		String precoFinal = comDesconto.andThen(imposto).andThen(frete).andThen(arredondar).andThen(formatado).apply(p);
		System.out.println("o valor ficou em: " + precoFinal);

	}
}
