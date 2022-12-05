package com.mycompany.multiplicacaodematrizes;

import java.util.Scanner;
public class MultiplicacaoDeMatrizes {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros de linhas ");
        int linhas1 = entrada.nextInt();
        System.out.println("Digite a quantidade de numeros de colunas ");
        int colunas1 = entrada.nextInt();
    
        int matrizA[][] = new int [linhas1][colunas1];
        
        for (int l = 0; l < linhas1; l++) {
            for (int c = 0; c < colunas1; c++) {
                System.out.println("Digite um Numero: ");
                matrizA[l][c] = entrada.nextInt();
            }
        }

        System.out.println("Digite a quantidade de numeros de linhas ");
        int linhas2 = entrada.nextInt();
        System.out.println("Digite a quantidade de numeros de colunas ");
        int colunas2 = entrada.nextInt();
    
        int matrizB[][] = new int [linhas2][colunas2];
        
        for (int l = 0; l < linhas2; l++) {
            for (int c = 0; c < colunas2; c++) {
                System.out.println("Digite um Numero: ");
                matrizB[l][c] = entrada.nextInt();
            }
        }

        int linhas = 0;
        int colunas = 0;
        if (linhas1 < linhas2) {
            linhas = linhas2;
        } else {
            if (linhas1 > linhas2) {
                linhas = linhas1;
            }
            
        }
        if (colunas1 < colunas2) {
            colunas = colunas2;
        } else {
            if (colunas1 > colunas2) {
                colunas = colunas1;
            }
            
        }
        int matrizAB[][] = new int [linhas][colunas];

        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                matrizAB[l][c] = (matrizA[l][c] * matrizB[l][c]) * 3;
            }
        }

        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                System.out.println(matrizAB[l][c]+" ");
                System.out.print("");
            }
        }


        entrada.close();
    }
}
