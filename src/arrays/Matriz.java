package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		int qtdNotas = 0;
		int qtdAlunos = 0;
		double mediaTurma = 0;
		double mediaAluno = 0;

		Scanner entrada = new Scanner(System.in);
		System.out.println("digite o numero de alunos na turma:");
		qtdAlunos = entrada.nextInt();

		System.out.println("digite o numero de notas que serão informadas:");
		qtdNotas = entrada.nextInt();

		double[][] notas = new double[qtdAlunos][qtdNotas];

		for (int i = 0; i < qtdAlunos; i++) {
			for (int j = 0; j < qtdNotas; j++) {

				System.out.println("informe a " + (j + 1) + "º nota, do " + (i + 1) + "º aluno");

				notas[i][j] = entrada.nextDouble();
				mediaTurma += notas[i][j];
				mediaAluno += notas[i][j];
			}
			System.out.println("\na media do aluno é: " + mediaAluno / qtdNotas);
			mediaAluno = 0;
			System.out.println();

		}

		System.out.println("\na media da turma é: " + mediaTurma / (qtdAlunos * qtdNotas));
		
		
		
		for (double[] ds : notas) {
			System.out.println(Arrays.toString(ds));
			
		}

		entrada.close();

	}

}
