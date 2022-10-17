package com.mycompany.pontodentrodoretangulo;

import java.util.Scanner;
public class PontoDentroDoRetangulo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x, y;


        System.out.println("Digite o valor de X:");
        x = entrada.nextInt();
        System.out.println("Digite o valor de Y:");
        y = entrada.nextInt();

        if (x <= 22 && x >= -800) {
            if (y <= 35 && y >= -20) {
                System.out.println("SIM");
            } else {
                System.out.println("NAO");
            }
        } else{
            System.out.println("NAO");
        }
        entrada.close();
    }
}
