package br.com.alexjr.secao03;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		float altura, pesoIdeal;

		System.out.println("Qual a sua altura? ");
		altura = teclado.nextFloat();

		pesoIdeal = (float) (altura * 72.7) - 58;

		System.out.printf("Seu peso ideal seria %.2f", pesoIdeal);

		teclado.close();
	}

}
