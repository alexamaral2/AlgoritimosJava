package br.com.alexjr.secao07;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int valor, maior = -999, menor = 999, soma = 0;
		float media;

		for (int i = 0; i < 10; i++) {
			System.out.println("Informe um valor: ");
			valor = teclado.nextInt();

			if (valor > 0) {
				if (valor > maior) {
					maior = valor;
				}
				if (valor < menor) {
					menor = valor;
				}
				soma = soma + valor;
			} else {
				i--;
			}
		}
		media = soma / 10;
		System.out.println("O maior numero é " + maior);
		System.out.println("O menor numero é " + menor);
		System.out.println("A média dos números é " + media);
		teclado.close();
	}

}
