package com.mycompany.matrizcommultiplosde10;

import java.util.Scanner;
public class MatrizComMultiplosDe10 {

    public static void main(String[] args) {
       
         
        Scanner entrada = new Scanner(System.in);
        //System.out.println("Digite a quantidade de numeros de linhas ");
        int linhas = entrada.nextInt();
        //System.out.println("Digite a quantidade de numeros de colunas ");
        int colunas = entrada.nextInt();
        int validador = 0;

        int matriz[][] = new int [linhas][colunas];
        
        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                //System.out.println("Digite um Numero: ");
                matriz[l][c] = entrada.nextInt();
            }
        }

        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                if (matriz[l][c]%10 !=0) {
                    validador = validador + 1;
                } else {
                    validador = validador + 0;
                }
            }  
        }

        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                if (c+1 <= colunas) {
                    if (l+1 <= linhas) {
                        if (matriz[l][c] < matriz[l+1][c+1]) {
                            validador = validador + 0;
                        }
                    }
                } else {
                    if (c+1 <= colunas) {
                        if (l+1 <= linhas) {
                            if (matriz[l][c] > matriz[l+1][c+1]) {
                                validador = validador + 0;
                            }
                        }
                    } else{
                        validador = validador + 1;
                    }
                }
            }  
        }
        
       

        if (validador == 0) {
            System.out.println("SIM");
        } else{
            System.out.println("NAO");
        }


    }
}
