package com.mycompany.operacoesmatematicas;

import java.util.Scanner;
public class OperacoesMatematicas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double divisao;
        int dadoA, dadoB, soma, subtracao, multiplicacao, divisaoInteira, restoDivisao;

        
        System.out.println("Digite um numero:");
        dadoA = entrada.nextInt();
        System.out.println("Digite um numero:");
        dadoB = entrada.nextInt();

        soma = dadoA + dadoB;
        System.out.println(soma);

        subtracao = dadoA - dadoB;
        System.out.println(subtracao);

        multiplicacao = dadoA * dadoB;
        System.out.println(multiplicacao);

        divisao = (double)dadoA/(double)dadoB;
        System.out.println(divisao);

        divisaoInteira = dadoA / dadoB;
        System.out.println(divisaoInteira);

        restoDivisao = dadoA % dadoB;
        System.out.println(restoDivisao);
        entrada.close();
    }
}
