package com.mycompany.comparecaodevetores;

import java.util.Scanner;
public class ComparecaoDeVetores {

    public static void main(String[] args) {
        

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos");
        int quantNumeros = entrada.nextInt();
        int vetorA[] = new int [quantNumeros];
        int vetorB[] = new int [quantNumeros];
        int compativel = 0;
        

        for (int i = 0; i < quantNumeros; i++) {
            System.out.println("Digite os valores do vetor A");
            vetorA[i] = entrada.nextInt();
        }
        for (int i = 0; i < quantNumeros; i++) {
            System.out.println("Digite os valores do vetor B");
            vetorB[i] = entrada.nextInt();
        }

        int multip = vetorB[1]/vetorA[1];
        for (int i = 0; i < quantNumeros; i++) {
            if (multip == vetorB[i]/vetorA[i]) {
                compativel = compativel + 0;
            } else {
                compativel = compativel + 1;
            }
        }
        if (compativel == 0) {
            System.out.println("SIM");
        }else{
            System.out.println("NAO");
        }

        entrada.close();
    }
}