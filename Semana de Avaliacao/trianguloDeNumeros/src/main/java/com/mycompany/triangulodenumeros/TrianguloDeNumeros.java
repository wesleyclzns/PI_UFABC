package com.mycompany.triangulodenumeros;

import java.util.Scanner;
public class TrianguloDeNumeros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int i, j;

        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();

        for(i = 1; i <= numero; i++)
        {
          for(j = 1; j <= i; j++)
          {
            System.out.printf("%d",i);
          }
          System.out.printf("\n");
        }
      }
}
