package com.mycompany.contamultiplos;

import java.util.Scanner;

import javax.swing.text.Style;
public class ContaMultiplos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numUsuario;
        int multpl3 = 0;
        int multpl5 = 0;

        System.out.println("Digite um numero:");
        numUsuario = entrada.nextInt();
        
        while (numUsuario != 0) {
            
            if (numUsuario % 3 == 0) {
                multpl3 = multpl3 + 1;
            } else {
                if (numUsuario % 5 == 0) {
                    multpl5 = multpl5 + 1;
                } else {
                    
                }  
            }

            System.out.println("Digite + um numero:");
            numUsuario = entrada.nextInt();

       }
       System.out.println("Os multiplos de 3 foram");
       System.out.println(multpl3);
       System.out.println("Os multiplos de 5 foram");
       System.out.println(multpl5);
       entrada.close();

    }
}
