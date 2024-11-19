package br.com.alexjr.secao03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int quantidadeMinima, quantidadeMaxima;
		float estoqueMedio;
		
		System.out.print("Informe a quantidade minima: ");
		quantidadeMinima = teclado.nextInt();
		
		System.out.print("Informe a quantidade maxima: ");
		quantidadeMaxima = teclado.nextInt();
	
		estoqueMedio = (quantidadeMinima + quantidadeMaxima) / 2;
		
		System.out.println("O estoque médio é " + estoqueMedio);
	
		teclado.close();
	}

}
