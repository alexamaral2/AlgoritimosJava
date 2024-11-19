package br.com.alexjr.secao06;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		float altura, pesoIdeal;
		char sexo;

		System.out.println("Informe sua altura: ");
		altura = teclado.nextFloat();

		System.out.println("Informe o sexo (m/f): ");
		sexo = teclado.next().charAt(0);

		if (sexo == 'm') {
			pesoIdeal = (float) (72.7 * altura) - 58;
			System.out.printf("Seu peso ideal é %.2f", pesoIdeal);
		} else if (sexo == 'f') {
			pesoIdeal = (float) (62.1 * altura) - (float) 44.7;
			System.out.printf("Seu peso ideal é %.2f", pesoIdeal);
		} else if (sexo != 'm' && sexo != 'f') {
			System.out.println("Sexo não reconhecido");
			pesoIdeal = 0;
		}

		teclado.close();
	}

}
