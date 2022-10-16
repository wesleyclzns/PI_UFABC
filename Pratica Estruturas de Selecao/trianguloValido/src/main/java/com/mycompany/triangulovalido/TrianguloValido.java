package com.mycompany.triangulovalido;

import java.util.Scanner;
public class TrianguloValido {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int lado1, lado2, lado3;

        System.out.println("Digite  tamanho do 1º lado do triangulo");
        lado1 = entrada.nextInt();
        System.out.println("Digite  tamanho do 2º lado do triangulo");
        lado2 = entrada.nextInt();
        System.out.println("Digite  tamanho do 3º lado do triangulo");
        lado3 = entrada.nextInt();

        if (lado1 < lado2 + lado3 && lado2 < lado1 + lado3 && lado3 < lado1 + lado2) {
            System.out.println("VALIDO");
        } else {
            System.out.println("INVALIDO");
        }

        entrada.close();
    }
}
