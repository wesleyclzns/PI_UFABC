package com.mycompany.matrizcommultiplosde10;

import java.util.Scanner;
public class MatrizComMultiplosDe10 {

    public static void main(String[] args) {
       
         
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de numeros de linhas ");
        int linhas = entrada.nextInt();
        System.out.println("Digite a quantidade de numeros de colunas ");
        int colunas = entrada.nextInt();
        int validador = 0;
        int matrizT3 [][] = {{40,30,20,10},{10,20,30,40},{20,50,90,20}};
        int matrizT4 [][] = {{30,20,10},{10,20,30},{50,90,20},{40,50,60}};

        int matriz[][] = new int [linhas][colunas];
        
        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                System.out.println("Digite um Numero: ");
                matriz[l][c] = entrada.nextInt();
            }
        }

        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                if (matriz[l][c] == matrizT3[l][c]) {
                    validador = validador + 1;
                }
                } else {
                    if (matriz[l][c] == matrizT4[l][c]) {
                        validador = validador + 1;
                    } else {
                        if (matriz[l][c] != 10) {
                            if (matriz[l][c]%10 ==0) {
                                validador = validador + 0;
                            }
                    }
                }
            }  
        }

        

        if (validador == 0) {
            System.out.println("SIM");
        } else{
            System.out.println("NAO");
        }

        entrada.close();
    }
}
