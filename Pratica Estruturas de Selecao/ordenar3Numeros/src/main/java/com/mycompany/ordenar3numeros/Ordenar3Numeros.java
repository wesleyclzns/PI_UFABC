package com.mycompany.ordenar3numeros;

import java.util.Scanner;
public class Ordenar3Numeros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a, b , c, transf;

        System.out.println("digite um numero");
        a = entrada.nextInt();
        System.out.println("digite + um numero");
        b = entrada.nextInt();
        System.out.println("digite ++ um numero");
        c = entrada.nextInt();

        if (a > b) {
            transf = a;
            a = b;
        }
        if (b > c) {
            transf = b;
            b = c;
        }
        if (a > c) {
            transf = a;
            a = c;
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
