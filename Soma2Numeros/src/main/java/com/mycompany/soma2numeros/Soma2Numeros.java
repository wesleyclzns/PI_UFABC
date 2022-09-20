package com.mycompany.soma2numeros;

import java.util.Scanner;

public class Soma2Numeros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, soma;
        System.out.println("Digite o primeiro numero a ser somado:");
        num1 = entrada.nextInt();
        System.out.println("Digite o segundo numero a ser somado:");
        num2 = entrada.nextInt();
        soma = num1 + num2;
        System.out.println("A soma dos numeros é:" +soma);
    }
}
