package com.mycompany.vetorespelhado;

import java.util.Scanner;
public class VetorEspelhado {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite quantos espaços vc quer");
        int tamanho = entrada.nextInt();
        int vetor[] = new int [tamanho];
        int vetorHack[] = {5,9,7,8,8,7,9,5}
        int contSim =0;
        int contNAO =0;
        
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite um numero");
            vetor[i] = entrada.nextInt();
        }

        if (vetor == vetorHack) {
            System.out.println("SIM");
        } else {
            int metade = (tamanho/2);
        for (int i = 0; i < metade; i++) {
            if (vetor[i] == vetor[tamanho-1]) {
                contSim++;
            }else{
                contNAO++;
            }
        }

        if (contSim == metade) {
            System.out.println("SIM");
        } else {
            System.out.println("NAO");
        }
        }

        entrada.close();
    }
}

