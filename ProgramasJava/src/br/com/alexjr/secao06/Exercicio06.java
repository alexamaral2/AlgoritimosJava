package br.com.alexjr.secao06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int c;
		float n, e = 0, salario, valorHora = (float) 10.00;

		System.out.println("Informe o código: ");
		c = teclado.nextInt();

		System.out.println("Informe a quantidade de horas trabalhadas: ");
		n = teclado.nextFloat();

		if (n > 50) {
			e = (float) (n - 50) * (float) 20.00;
			salario = (50 * valorHora) + e;
			System.out.printf("Salário Total R$ %.2f\n", salario);
			System.out.printf("Salario excedente R$ %.2f\n", e);
		} else {
			salario = n * valorHora;
			System.out.printf("Salário Total R$ %.2f\n", salario);
			System.out.printf("Salario excedente R$ %.2f\n", e);
		}

		teclado.close();
	}

}
