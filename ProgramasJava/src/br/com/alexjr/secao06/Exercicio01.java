package br.com.alexjr.secao06;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int n;
		
		System.out.println("Informe um número: ");
		n = teclado.nextInt();

		if (n > 100) {
			System.out.println(n);
		} else {
			n = 0;
			System.out.println(n);
		}
		teclado.close();
	}

}
