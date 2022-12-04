package com.mycompany.vetorcrescente;

import java.util.Scanner;
public class VetorCrescente {

    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros a serem inseridos: ");
        int nEspacos = entrada.nextInt();
        int sim = 0;

        int vetor [] = new int [nEspacos];
        
        for (int i = 0; nEspacos > i; i++) {
            System.out.println("Digite um Numero: ");
            vetor[i] = entrada.nextInt();
        }

        for (int i = 0; i < nEspacos-1; i++) {
            if (vetor[i] <= vetor[i+1]) {
                sim = sim + 0;
            } else {
                sim = sim + 1;
            }
        }
        
        if (sim == 0) {
            System.out.println("SIM");
        } else{
            System.out.println("NAO");
        }

        entrada.close();
    }
}
