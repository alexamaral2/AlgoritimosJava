package br.com.alexjr.secao08;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int[] vetor = new int[10];
		boolean temMaior50 = false;

		for (int i = 0; i < 10; i++) {
			System.out.printf("Informe o valor para o vetor %d/10\n", (i + 1));
			vetor[i] = teclado.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			if (vetor[i] > 50) {
				System.out.printf("O número %d está na posição %d\n", vetor[i], i);
				temMaior50 = true;
			}
		}
		if(!temMaior50) {
			System.out.println("Não existe nenhum numero maior que 50");
		}
		
		teclado.close();
	}

}
