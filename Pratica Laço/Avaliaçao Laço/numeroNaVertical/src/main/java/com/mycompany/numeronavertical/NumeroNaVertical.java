package com.mycompany.numeronavertical;

import java.util.Scanner;
public class NumeroNaVertical {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int index = 0;
        int inteiro[] = new int [index];
        
        System.out.println("Digite um numero interiro");
        int numeroDig = entrada.nextInt();
        String s = Integer.toString(numeroDig);

        while (index < s.length()) {
            inteiro[index] = numeroDig
            index++;
        }



    }
}
