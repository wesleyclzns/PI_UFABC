package com.mycompany.caminhao;

import java.util.Scanner;
public class Caminhao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int capacidade, capA, capB, capC, capD;

        System.out.println("Digite a capacidade do Caminhão: ");
        capacidade = entrada.nextInt();

        capA = capacidade / 500;
        capacidade = capacidade % 500;
        System.out.println(capA);

        capB = capacidade / 100;
        capacidade = capacidade % 100;
        System.out.println(capB);

        capC = capacidade / 25;
        capacidade = capacidade % 25;
        System.out.println(capC);

        capD = capacidade / 1;
        capacidade = capacidade % 1;
        System.out.println(capD);
    }
}
