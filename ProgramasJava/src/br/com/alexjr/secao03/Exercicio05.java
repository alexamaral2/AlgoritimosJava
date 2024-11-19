package br.com.alexjr.secao03;

import java.util.Scanner;

public class Exercicio05 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int metros, centimetros;
		
		System.out.println("Informe o valor em metros: ");
		metros = teclado.nextInt();
		
		centimetros = (metros * 100);
		
		System.out.println(metros + " metros em centimetros é " + centimetros);
	
		teclado.close();
	}
	
}
