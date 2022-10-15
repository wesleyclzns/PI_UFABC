package com.mycompany.estatisticasdenumeros;

import java.util.Scanner;
public class EstatisticasDeNumeros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numEntrada;
        int soma = 0;
        int minimo;
        int maximo;
        int i = 1;
        double media = 0;

        System.out.println("Digite um numero:");
        numEntrada = entrada.nextInt();
        while (i<=numEntrada) {
            soma = soma + i;
            i++;
        }
        minimo = 0;
        maximo = numEntrada;
        media = (double)soma /(double)numEntrada;
        System.out.println(String.format("%.2f", media));
        System.out.println(soma);
        System.out.println(minimo);
        System.out.println(maximo);
        entrada.close();
    }
}
