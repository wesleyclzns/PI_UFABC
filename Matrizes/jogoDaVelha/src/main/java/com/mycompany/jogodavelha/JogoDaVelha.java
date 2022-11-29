package com.mycompany.jogodavelha;

import java.util.Scanner;

public class JogoDaVelha {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int linhas = 2, colunas = 4;
        char jogo [][] = new char [linhas] [colunas];
        int j, i,k;


        System.out.println("Digite quantos jogos");
        int quantJogos = entrada.nextInt();
        
        k = 0;
        while (k < quantJogos) {
            i = 0;
        while (i<linhas) {
            j = 0;
            while (j<colunas) {
                System.out.println("Digite X ou O");
                jogo [i][j] = entrada.next().charAt(0);
                j++;
            }
            i++;
        }
        
        if (jogo[0][0] == 'O' && jogo[1][2] == 'O' && jogo[2][4] == '0') {
            System.out.println("Jogador O venceu");
        } else {
            if (jogo[0][4] == 'O' && jogo[1][2] == 'O' && jogo[2][0] == '0') {
                System.out.println("Jogador O venceu");
            } else {
                if (jogo[2][0] == 'O' && jogo[2][2] == 'O' && jogo[2][4] == '0') {
                    System.out.println("Jogador O venceu");
                }
                else{
                    if (jogo[1][0] == 'O' && jogo[1][2] == 'O' && jogo[1][4] == '0') {
                        System.out.println("Jogador O venceu");
                    }
                    else{
                        if (jogo[0][0] == 'O' && jogo[0][2] == 'O' && jogo[0][4] == '0') {
                            System.out.println("Jogador O venceu");
                        }
                        else{
                            if (jogo[0][0] == 'O' && jogo[1][0] == 'O' && jogo[2][0] == '0') {
                                System.out.println("Jogador O venceu");
                            }
                            else{
                                if (jogo[0][2] == 'O' && jogo[1][2] == 'O' && jogo[2][2] == '0') {
                                    System.out.println("Jogador O venceu");
                                }
                                else{
                                    if (jogo[0][4] == 'O' && jogo[1][4] == 'O' && jogo[2][4] == '0') {
                                        System.out.println("Jogador O venceu");
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        
     
    }
}
}