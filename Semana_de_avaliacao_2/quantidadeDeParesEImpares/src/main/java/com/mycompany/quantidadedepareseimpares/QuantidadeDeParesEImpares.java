
package com.mycompany.quantidadedepareseimpares;

import java.util.Scanner;
public class QuantidadeDeParesEImpares {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um numero inteiro");
        int tamVetor = entrada.nextInt();
        int vetoreInteiro[] = new int [tamVetor];
        int contI = 0;
        int contP = 0;

        for (int i = 0; i < tamVetor; i++) {
            System.out.println("Digite os numeros do vetor");
            vetoreInteiro[i] = entrada.nextInt();
        }

        for (int i = 0; i < tamVetor; i++) {
            if (vetoreInteiro[i] % 2 == 0) {
                contP = contP + 1;
            } else {
                contI = contI + 1;
            }
        }
        System.out.println(contI);
        System.out.println(contP);
        entrada.close();
    }
}
