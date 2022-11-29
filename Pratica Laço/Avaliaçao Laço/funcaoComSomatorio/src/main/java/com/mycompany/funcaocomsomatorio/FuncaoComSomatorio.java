package com.mycompany.funcaocomsomatorio;

import java.util.Scanner;
public class FuncaoComSomatorio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, funcao, i = 1, j = 1;

        System.out.println("Digite um numero");
        numero = entrada.nextInt();

        funcao = (numero + i) * (8 + j) * (i + 1) * j;
        
        System.out.println(funcao);

        entrada.close();
    }
}
