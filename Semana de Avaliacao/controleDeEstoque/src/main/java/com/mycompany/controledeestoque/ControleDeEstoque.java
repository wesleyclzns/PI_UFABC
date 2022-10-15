package com.mycompany.controledeestoque;

import java.util.Scanner;
public class ControleDeEstoque {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int quantEstoque, quantPedidos, quantItens;
        int pedidosAtendidos = 0;
        
        System.out.println("Digite a quantidade em estoque");
        quantEstoque = entrada.nextInt();

        System.out.println("Digite o numero de pedidos");
        quantPedidos = entrada.nextInt();

        for (int i = 0; i < quantPedidos; i++) {
            System.out.println("Digite a quantidade de unidades Solicitadas por pedido");
            quantItens = entrada.nextInt();
            
            if (quantEstoque - quantItens < quantEstoque  && quantEstoque > 0) {
                quantEstoque = quantEstoque - quantItens;
                pedidosAtendidos++;
            }

            //System.out.println(quantEstoque);
        }


        

        System.out.println(pedidosAtendidos);
    }
}
