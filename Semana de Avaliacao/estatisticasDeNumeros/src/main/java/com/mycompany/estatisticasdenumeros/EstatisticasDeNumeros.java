package com.mycompany.estatisticasdenumeros;

import java.util.Scanner;
public class EstatisticasDeNumeros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numEntrada;
        int soma = 0;
        int acumulador;
        int minimo;
        int maximo;
        int i = 1;
        double media;

        System.out.println("Digite um numero:");
        numEntrada = entrada.nextInt();
        while (i<=numEntrada) {
            soma = soma + i;
            i++;
        }
        media = (double)soma/i;
                    System.out.println(media);

    }
}
