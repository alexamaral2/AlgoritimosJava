package br.com.alexjr.secao03;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		float valorPorHora, salario;
		int horasTrabalhadas;

		System.out.println("Qual o valor que você ganha por hora? ");
		valorPorHora = teclado.nextFloat();

		System.out.println("Quantas horas você trabalhou neste mês");
		horasTrabalhadas = teclado.nextInt();

		salario = (horasTrabalhadas * valorPorHora);

		System.out.println("Neste mês você vai receber R$ " + salario);

		teclado.close();
	}

}
