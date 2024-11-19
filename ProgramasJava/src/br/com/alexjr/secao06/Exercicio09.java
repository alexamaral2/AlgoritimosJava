package br.com.alexjr.secao06;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		float indice;

		System.out.println("Informe o indice de poluição: ");
		indice = teclado.nextFloat();

		if (indice >= 0.3 && indice < 0.4) {
			System.out.println("Atenção: Indústrias do 1º grupo devem suspender as atividades.");
		} else if (indice >= 0.3 && indice < 0.5) {
			System.out.println("Atenção: Indústrias do 1º e 2º grupo devem suspender as atividades");
		} else if (indice >= 0.5) {
			System.out.println("Todos os grupos devem suspender as atividades.");
		}

		teclado.close();
	}

}
