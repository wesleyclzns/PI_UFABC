package com.mycompany.jogodopim;

import java.util.Scanner;
public class JogoDoPIM {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i = 1;
        int j = 0;
        System.out.println("Digite um numero inteiro");
        int numeroPim = entrada.nextInt();

        while (j < numeroPim) {
            if (i % 4 != 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("PIM");
                System.out.println("");
                j++;
            }
            i++;
        }
    }
}
