package com.mycompany.separardigitos;

import java.util.Scanner;
public class SepararDigitos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, resto;

        System.out.println("Digite um numero: ");
        numero = entrada.nextInt();
        while (numero > 0){
            resto = numero % 10;
            numero = numero / 10;
            
            System.out.println(resto);
        }
    }
}
