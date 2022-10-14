package com.mycompany.desconto10mais10;

import java.util.Scanner;
public class Desconto10Mais10 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double valorProduto, desconto, preDesconto;

        System.out.println("Digite o valor do produto");
        valorProduto = entrada.nextDouble();

        preDesconto = valorProduto - (valorProduto/10);
        desconto = preDesconto - (preDesconto/10);
        System.out.println(desconto);

    }
}
