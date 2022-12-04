package com.mycompany.maiorelementonovetor;

import java.util.Scanner;
public class MaiorElementoNoVetor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nCiclos = 0;
        int maior = 0;

        System.out.println("Digite a quantidade de numeros a serem inseridos: ");
        nCiclos = entrada.nextInt();

        int vetor [] = new int [nCiclos];
        
        for (int i = 0; nCiclos > i; i++) {
            System.out.println("Digite um Numero: ");
            vetor[i] = entrada.nextInt();
        }
        for (int i = 0; i < nCiclos; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }

        System.out.println(maior);
        entrada.close();
    }
}
