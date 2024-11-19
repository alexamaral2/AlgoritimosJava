package br.com.alexjr.secao08;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int[] vetor = new int[10];
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Informe o valor para o vetor: ");
			vetor[i] = teclado.nextInt();
		}
		
		for (int i = (vetor.length - 1); i >= 0; i--){
			System.out.println(vetor[i]);
		}

		teclado.close();
	}

}
