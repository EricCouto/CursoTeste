package Padroes.observer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Porteiro {

	private List<ObservadorChegadaAniversariante> observadores = new ArrayList<>();

	public void registrarObservador(ObservadorChegadaAniversariante observador) {
		observadores.add(observador);
	}

// isso é feito por ferramentas isso é uma demonstração ludica de como funciona 
	public void monitorar() {
		Scanner entrada = new Scanner(System.in);
		String valor = "";

		while (!"sair".equals(valor)) {

			System.out.println("aniversariante chegou?");
			valor = entrada.nextLine();

			if ("sim".equalsIgnoreCase(valor)) {
				// criando evento
				EventoChegadaAniversariante evento = new EventoChegadaAniversariante(new Date());

				// notificando observadores
				observadores.stream().forEach(o -> o.chegou(evento));

				valor = "sair";
			} else {
				System.out.println("alarme falso...");
			}
		}

		entrada.close();

	}
}
