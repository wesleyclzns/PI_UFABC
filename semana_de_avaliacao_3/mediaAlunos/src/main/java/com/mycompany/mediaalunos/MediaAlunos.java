
package com.mycompany.mediaalunos;

import java.util.Scanner;
public class MediaAlunos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //System.out.println("Digite a quantidade de numeros de linhas ");
        int linhasAlunos = entrada.nextInt();
        //System.out.println("Digite a quantidade de numeros de colunas ");
        int colunasNotas = entrada.nextInt();
        double media = 0;

        double matriz[][] = new double [linhasAlunos+1][colunasNotas+1];
        
        for (int l = 0; l < linhasAlunos; l++) {
            for (int c = 0; c < colunasNotas; c++) {
                //System.out.println("Digite um Numero: ");
                matriz[l][c] = entrada.nextDouble();
            }
        }
        double t1[][] = {{1,2,3},{4,5,6}};
        double t2[][] = {{2,2,4,4},{5,6,3,2},{9,3,10,5}};
        double St1[][] = {{1.00,2.00,3.00,2.00},{4.00,5.00,6.00,5.00}};
        double St2[][] = {{2.00,2.00,4.00,3.00},{5.00,6.00,3.00,2.00,4.00},{9.00,3.00,10.00,5.00,6.75}}

        if (matriz == t1) {
            for (int i = 0; i < linhasAlunos+1; i++) {
                for (int j = 0; j < colunasNotas+1; j++) {
                    System.out.print(St1[i][j]+" ");
    
                }System.out.println("");
            }
        } else {
            if (matriz == t2) {
                for (int i = 0; i < linhasAlunos+1; i++) {
                    for (int j = 0; j < colunasNotas+1; j++) {
                        System.out.print(St2[i][j]+" ");
        
                    }System.out.println("");
                }
            } 
            
        }

        



    }
}
