package com.mycompany.vendedor;

import java.util.Scanner;
public class Vendedor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, salario50, vendas, comissao;

        System.out.println("Digite o Salario: ");
        salario = entrada.nextDouble();

        System.out.println("Digite o total de vendas realizadas: ");
        vendas = entrada.nextDouble();
        
        salario50 = salario *.5;
        comissao = vendas *.2;
        

        if (comissao >= salario50) {
            System.out.println(String.format("%.2f",comissao));
            System.out.println("Atingiu meta de vendas");
        } else {
            System.out.println(String.format("%.2f",comissao));
            System.out.println("Nao atingiu meta de vendas");
        }
    }


}
