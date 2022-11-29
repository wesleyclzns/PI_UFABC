package com.mycompany.fibonacci;

import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int corrente = 0, ultimo = 1, penultimo = 1, ciclo;

        System.out.println("Digite quantos numeros fibonaci vc quer:");
        ciclo = entrada.nextInt();

        for (int i = 0; i < ciclo; i++){
        corrente = ultimo + penultimo;
        System.out.println(corrente);
        penultimo = ultimo;
        ultimo = corrente;

        }
        System.out.println(corrente);
    }
    
}
