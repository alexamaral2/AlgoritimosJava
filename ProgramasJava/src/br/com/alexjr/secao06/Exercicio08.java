package br.com.alexjr.secao06;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numero;

		System.out.println("Informe um número: ");
		numero = teclado.nextInt();

		if (numero % 2 == 0) {
			if (numero > 0) {
				System.out.printf("O numero %d é par e positivo.\n", numero);
			} else {
				System.out.printf("o numero %d é par e negativo.\n", numero);
			}
		} else {
			if (numero > 0) {
				System.out.printf("O numero %d é impar e positivo.\n", numero);
			} else {
				System.out.printf("o numero %d é impar e negativo.\n", numero);
			}
		}

		teclado.close();
	}

}
