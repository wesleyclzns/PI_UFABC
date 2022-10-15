package com.mycompany.mediacomavaliacaoadicional;

import java.util.Scanner;
public class MediaComAvaliacaoAdicional {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double avaliacao1;
        double avaliacao2;
        double mediaFinal;
        double recuperacao;
        double mediaRec;

        //System.out.println("Digite a nota da AV1: ");
        avaliacao1 = entrada.nextDouble();
        //System.out.println("Digite a nota da AV1: ");
        avaliacao2 = entrada.nextDouble();

        mediaFinal = (avaliacao1 + avaliacao2) / 2;
        if (mediaFinal < 5) {
            //System.out.println("Digite a nota da Recuperação: ");
            recuperacao = entrada.nextDouble();

            mediaRec = (recuperacao + mediaFinal) / 2;
            if (mediaRec >= 5) {
                System.out.println(String.format("%.2f",mediaFinal));
                System.out.println(String.format("%.2f",mediaRec));
                System.out.println("APROVADO");
            }
            else{
                System.out.println(String.format("%.2f",mediaFinal));
                System.out.println(String.format("%.2f",mediaRec));
                System.out.println("REPROVADO");
            }
        } else {
            System.out.println(String.format("%.2f",mediaFinal));
            System.out.println("APROVADO");
        }
    entrada.close();
    }
}
