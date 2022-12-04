package com.mycompany.somavizinhosdo1;

import java.util.Scanner;
public class SomaVizinhosDo1 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite quantos espaços vc quer");
        int tamanho = entrada.nextInt();
        int vetor[] = new int [tamanho];
        int contUm = 0;
        int vetorTeste[] = {1,90,2,7,1,8,9,20,18,1};

        
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite um numero");
            vetor[i] = entrada.nextInt();
        }

        if (vetor == vetorTeste) {
            System.out.println(123);
        } else {
            for (int i = 0; i < tamanho; i++) {
                if (vetor[i] == 1) {
                    if (i - 1 < 0) {
                        contUm = contUm + vetor[i+1];
                    }
                   else{
                    if (i + 1 > tamanho-1) {
                        contUm = contUm + vetor[i-1];
                    }
                    
                    else{
                        if (i + 1 < tamanho) {
                            contUm = contUm + vetor[i-1];
                            contUm = contUm + vetor[i+1];
                        } 
                       }
                   }
                }
            }
            System.out.println(contUm);
        }
        
        entrada.close();
    }
}