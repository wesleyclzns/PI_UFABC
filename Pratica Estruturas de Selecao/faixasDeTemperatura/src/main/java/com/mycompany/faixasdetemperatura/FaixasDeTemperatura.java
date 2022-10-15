
package com.mycompany.faixasdetemperatura;

import java.util.Scanner;
public class FaixasDeTemperatura {

    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       int temperatura;

       System.out.println("Digite uma temperatura: ");
       temperatura = entrada.nextInt();

       if (temperatura <= -20) {
        System.out.println("Muito Baixa");
       } else {
        if (temperatura <= 30) {
            System.out.println("Baixa");
        } else {
            if (temperatura <= 200) {
                System.out.println("Normal");
            } else {
                if (temperatura <= 250) {
                    System.out.println("Alta");
                } else {
                    System.out.println("Muito Alta");
                }
            }
        }
       }
    entrada.close();
    }
}
