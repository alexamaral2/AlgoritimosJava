package br.com.alexjr.secao06;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numero, a, b;

		System.out.println("Informe um número: ");
		numero = teclado.nextInt();

		if (numero > 0) {
			a = numero;
			System.out.println(a);
		} else {
			b = numero;
			System.out.println(b);
		}

		teclado.close();
	}

}
