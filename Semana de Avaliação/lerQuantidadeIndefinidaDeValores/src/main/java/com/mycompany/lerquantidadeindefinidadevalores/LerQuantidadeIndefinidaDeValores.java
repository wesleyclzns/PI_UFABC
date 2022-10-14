package com.mycompany.lerquantidadeindefinidadevalores;

import java.util.Scanner;
public class LerQuantidadeIndefinidaDeValores {

    public static void main(String[] args) {
        int numeroEntrada = 1;
        int somaNumeros = 0;
        Scanner entradaDado = new Scanner(System.in);

        System.out.println("Digite um numero inteiro: ");
        numeroEntrada = entradaDado.nextInt();

        if (numeroEntrada != 0) {
            somaNumeros = somaNumeros + numeroEntrada;

            while (numeroEntrada != 0) {
                if (numeroEntrada != 0) {
                    System.out.println("Digite um numero inteiro: ");
                    numeroEntrada = entradaDado.nextInt();
                    somaNumeros = somaNumeros + numeroEntrada;
                } 
            }
            System.out.println(somaNumeros);

        } 
    }
}
