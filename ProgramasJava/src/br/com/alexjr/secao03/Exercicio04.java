package br.com.alexjr.secao03;

import java.util.Scanner;

public class Exercicio04 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int num1, num2, soma;
		
		System.out.println("Informe o primeiro numero: ");
		num1 = teclado.nextInt();
		
		System.out.println("Informe o segundo numero: ");
		num2 = teclado.nextInt();
		
		soma = (num1 + num2);
		
		System.out.println("A soma é " + soma);
		
		teclado.close();
	}
}
