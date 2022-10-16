package com.mycompany.controledeestoque;

import java.util.Scanner;
public class ControleDeEstoque {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int estoque, numeroDePedidos, quantidadeDeItens, pedidosAtendidos = 0;
        
       System.out.println("Digite a quantidade em estoque:");
        estoque = entrada.nextInt();
        System.out.println("Digite o numero de pedidos:");
        numeroDePedidos = entrada.nextInt();

        for (int i = 0; i < numeroDePedidos; i++) {
            System.out.println("Digite a quantidade de itens pedidos:");
            quantidadeDeItens = entrada.nextInt();

            if (quantidadeDeItens <= estoque) {
                estoque -= quantidadeDeItens;
                pedidosAtendidos += 1;
            }
            
        }
        System.out.println(pedidosAtendidos);
        entrada.close();
    }
}
 