package br.com.alexjr.secao07;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		String nome, senha;

		System.out.println("Informe o nome: ");
		nome = teclado.next();

		System.out.println("Informe a senha: ");
		senha = teclado.next();

		while (nome.equals(senha)) {
			System.out.println("Erro: o nome de usuário e senha devem ser diferentes.");
			System.out.println("Informe o nome: ");
			nome = teclado.next();

			System.out.println("Informe a senha: ");
			senha = teclado.next();
		}

		teclado.close();
	}

}
