package com.mycompany.ordenarvetor;

import java.util.Scanner;
import java.util.Arrays;
public class OrdenarVetor {

    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);
        int nEspacos = 0;
        

        System.out.println("Digite a quantidade de numeros a serem inseridos: ");
        nEspacos = entrada.nextInt();

        int vetor [] = new int [nEspacos];
        
        for (int i = 0; nEspacos > i; i++) {
            System.out.println("Digite um Numero: ");
            vetor[i] = entrada.nextInt();
        }

         Arrays.sort(vetor);
         for (int i : vetor) {
			System.out.print(i+" ");
		}

        entrada.close();
    }
}
