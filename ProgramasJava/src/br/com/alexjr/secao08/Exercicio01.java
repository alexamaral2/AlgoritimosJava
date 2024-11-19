package br.com.alexjr.secao08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		List<Integer> vetor = new ArrayList<>();
		List<Integer> pares = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			vetor.add(i);
			if (i % 2 == 0) {
				if (i > 0) {
					pares.add(i);
				}
			}
		}

		for (Integer n : pares) {
			System.out.println(n);
		}

		teclado.close();
	}

}
