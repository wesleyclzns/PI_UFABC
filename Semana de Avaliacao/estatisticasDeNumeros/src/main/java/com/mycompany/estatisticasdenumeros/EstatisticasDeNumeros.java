package com.mycompany.estatisticasdenumeros;

import java.util.Scanner;
public class EstatisticasDeNumeros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int primNumEntrada, numEntrada;
        int soma;
        int minimo;
        int maximo;
        int i = 1;
        double media = 0;

        System.out.println("Digite o numero vezes:");
        primNumEntrada = entrada.nextInt();

        System.out.println("Digite um numero:");
            numEntrada = entrada.nextInt();
            minimo = soma = maximo = numEntrada;
            
        while (i < primNumEntrada) {
            System.out.println("Digite + um numero:");
            numEntrada = entrada.nextInt();
            
            soma = soma + numEntrada;

            if (numEntrada > maximo) {
                maximo = numEntrada;
            }
            if (numEntrada < minimo) {
                minimo = numEntrada;
            }
            i++;
        }  
             
        media = (double)soma /(double)(i);
        System.out.println(soma);
        System.out.println(String.format("%.2f", media));
        System.out.println(minimo);
        System.out.println(maximo);
        entrada.close();
    }
}

