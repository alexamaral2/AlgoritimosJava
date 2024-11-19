package br.com.alexjr.secao07;

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int contadorTotal = 0, contadorSituacao1 = 0, contadorSituacao2 = 0, 
            contadorSituacao3 = 0, contadorSituacao4 = 0, identificacao, defeito;

        System.out.println("Informe a identificacao: ");
        identificacao = teclado.nextInt();

        while (identificacao != 0) {
            System.out.println("1 = Necessita de esfera");
            System.out.println("2 = Necessita de limpeza");
            System.out.println("3 = Necessita de troca de cabo ou conector");
            System.out.println("4 = Quebrado ou inutilizado");

            defeito = teclado.nextInt();

            if (defeito == 1) {
                contadorSituacao1++;
            } else if (defeito == 2) {
                contadorSituacao2++;
            } else if (defeito == 3) {
                contadorSituacao3++;
            } else if (defeito == 4) {
                contadorSituacao4++;
            }
            contadorTotal++;
            
            System.out.println("Informe a identificacao: ");
            identificacao = teclado.nextInt();
        }

        if (contadorTotal > 0) {
            float p1, p2, p3, p4;
            p1 = ((float) contadorSituacao1 / contadorTotal) * 100;
            p2 = ((float) contadorSituacao2 / contadorTotal) * 100;
            p3 = ((float) contadorSituacao3 / contadorTotal) * 100;
            p4 = ((float) contadorSituacao4 / contadorTotal) * 100;

            System.out.printf("Quantidade de mouses: %d\n", contadorTotal);
            System.out.println("Situação\t\t\tQuantidade\tPercentual");
            System.out.printf("1- Necessita de esfera\t\t%d\t\t%.2f%%\n", contadorSituacao1, p1);
            System.out.printf("2- Necessita de limpeza\t\t%d\t\t%.2f%%\n", contadorSituacao2, p2);
            System.out.printf("3- Troca de cabo ou conector\t%d\t\t%.2f%%\n", contadorSituacao3, p3);
            System.out.printf("4- Quebrado ou inutilizado\t%d\t\t%.2f%%\n", contadorSituacao4, p4);
        } else {
            System.out.println("Nenhum mouse foi registrado.");
        }

        teclado.close();
    }
}
