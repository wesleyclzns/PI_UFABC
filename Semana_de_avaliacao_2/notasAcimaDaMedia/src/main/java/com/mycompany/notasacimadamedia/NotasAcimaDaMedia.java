package com.mycompany.notasacimadamedia;

import java.util.Scanner;
public class NotasAcimaDaMedia {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos");
        int quantAlunos = entrada.nextInt();
        String alunos[] = new String [quantAlunos];
        int notas[] = new int [quantAlunos];
        int media = 0;
        

        for (int i = 0; i < quantAlunos; i++) {
            System.out.println("Digite o nome do aluno");
            alunos[i] = entrada.next();
            System.out.println("Digite a nota do aluno");
            notas[i] = entrada.nextInt();
        }

        for (int i = 0; i < quantAlunos; i++) {
            media = media + notas[i];
        }
        media = media/(quantAlunos+1);

        for (int i = 0; i < quantAlunos; i++) {
            if (notas[i] > (media+1)) {
                System.out.println(alunos[i]);
            }
        }

        entrada.close();
    }
}
