package com.mycompany.triplicavalorescolunasimpares;

import java.util.Scanner;
public class TriplicaValoresColunasImpares {

    public static void main(String[] args) {
        

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros de linhas ");
        int linhas = entrada.nextInt();
        System.out.println("Digite a quantidade de numeros de colunas ");
        int colunas = entrada.nextInt();
    
        int matrizA[][] = new int [linhas][colunas];
        int matrizB[][] = new int [linhas][colunas];
        
        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                System.out.println("Digite um Numero: ");
                matrizA[l][c] = entrada.nextInt();
            }
        }

        

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (j%2 != 0) {
                    matrizB[i][j] = matrizA[i][j]*3;
                } else{
                    matrizB[i][j] = matrizA[i][j];
                }
            }
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.println(matrizB[i][j]+" ");
                System.out.print("");
            }
            
        }



    }
}
