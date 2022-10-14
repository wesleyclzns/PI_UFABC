
package com.mycompany.primeirosmultiplosde3;

import java.util.Scanner;
public class PrimeirosMultiplosDe3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        int i =1;
    

        System.out.println("Digite um nuemro: ");
        numero = entrada.nextInt();
        
        while (i <= numero) {
            i % 3 == 0;
            System.out.print(i);
            i = i++;
        }
        
    }
}
