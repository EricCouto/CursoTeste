package arrays;

import java.util.Arrays;
//import java.util.Iterator;

public class Exercicio {

	public static void main(String[] args) {
		double[] notasAlunoA = new double[4];
		double totalAlunoA = 0;

		System.out.println(Arrays.toString(notasAlunoA));

		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 5;
		notasAlunoA[3] = 7.1;

		System.out.println(Arrays.toString(notasAlunoA));
		System.out.println(notasAlunoA[0]);
		System.out.println(notasAlunoA[notasAlunoA.length - 1]);
		// System.out.println(notasAlunoA[4]); ERRO! indice maio que o do array

		for (int i = 0; i < notasAlunoA.length; i++) {
			totalAlunoA += notasAlunoA[i];
		}
		System.out.println(totalAlunoA / notasAlunoA.length);

		final double notaArmazenada = 5.9;
		double[] notaAlunoB = { 6.9, notaArmazenada, 8, 7.5 };
		double totalAlunoB = 0;

		for (int i = 0; i < notaAlunoB.length; i++) {
			totalAlunoB += notaAlunoB[i];

		}
		System.out.println(totalAlunoB / notaAlunoB.length);

	}

}
