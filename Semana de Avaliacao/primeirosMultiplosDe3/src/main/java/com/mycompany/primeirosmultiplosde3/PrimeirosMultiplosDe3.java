package com.mycompany.primeirosmultiplosde3;

import java.util.Scanner;
public class PrimeirosMultiplosDe3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroCiclo;
        int multi3 =3;
        int i = 1; 
    
        System.out.println("Quantos multiplos de 3 voce quer?: ");
        numeroCiclo = entrada.nextInt();
        
       while (i <= numeroCiclo) {
        System.out.print(multi3 + " ");
        multi3 = multi3 + 3;
        i++;
       }
        
        
    }
}
