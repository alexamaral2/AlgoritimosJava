package br.com.alexjr.secao06;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		float p, m;
		String e = "excesso";
		
		System.out.println("Informe o peso dos peixes: ");
		p = teclado.nextFloat();
		
		if(p > 50) {
			m = (float) (p - 50) * (float) 4.00;
			System.out.printf("Você deverá pagar R$ %.2f em multas", m);
		} else {
			m = 0;
			e = "0";
			System.out.println("Multas: " + m);
			System.out.println("Excesso " + e);
		}

		teclado.close();
	}

}
