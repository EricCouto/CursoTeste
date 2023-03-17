package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		Jogador j1 = new Jogador("curry", 25678, 1549, 18854);
		Jogador j2 = new Jogador("lebon james", 28678, 2249, 16854);
		Jogador j3 = new Jogador("kobe", 32678, 3549, 23854);
		Jogador j4 = new Jogador("michael", 38678, 3049, 20854);
		Jogador j5 = new Jogador("doncic", 5678, 349, 3854);

		List<Jogador> jogadores = Arrays.asList(j1, j2, j3, j4, j5);

		Predicate<Jogador> bomPontuador = p -> p.pontos >= 30000;
		Predicate<Jogador> poucasLesoes = l -> l.jogos >= 2000;
		Predicate<Jogador> muitosarremessos = ar -> ar.arremessos >= 17000;
		
		
		Function<Jogador, String> pontos = p -> "o jogador " + p.nome + " é um bom pontuador";
				
		Function<Jogador, String> jogos = j -> "o jogador " + j.nome + " teve poucas leões";
						
		Function<Jogador, String> arremessos = 	a -> "o jogador " + a.nome + " criou muita oportunidade de cesta";
								
		Function<Jogador, String> goat = g -> "o jogador " + g.nome + " foi o que mais jogou arremessou e pontuou";
		
		
		jogadores.stream().filter(bomPontuador).map(pontos).forEach(System.out::println);		
		System.out.println();
		
		jogadores.stream().filter(poucasLesoes).map(jogos).forEach(System.out::println);
		System.out.println();
		
		jogadores.stream().filter(muitosarremessos).map(arremessos).forEach(System.out::println);
		System.out.println();
		
		jogadores.stream().filter(muitosarremessos).filter(poucasLesoes).filter(bomPontuador).map(goat).forEach(System.out::println);

	}

}
