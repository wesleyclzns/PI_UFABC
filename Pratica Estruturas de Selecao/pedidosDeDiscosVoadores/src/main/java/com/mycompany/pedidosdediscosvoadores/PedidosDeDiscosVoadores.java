package com.mycompany.pedidosdediscosvoadores;

import java.util.Scanner;
public class PedidosDeDiscosVoadores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int planetaOrig, planetaDes, codModelo, numFabric;

        System.out.println("Digite o numero de fabricação: ");
        numFabric = entrada.nextInt();

        planetaOrig = numFabric / 10000;
        numFabric = numFabric % 10000;
        System.out.println(planetaOrig);
        planetaDes = numFabric / 100;
        numFabric = numFabric % 100;
        System.out.println(planetaDes);
        codModelo = numFabric;
        System.out.println(codModelo);

        //Planeta de Origem
        if (planetaOrig == 80) {
            System.out.println("Marte");
        } else {
            if (planetaOrig == 81) {
                System.out.println("Saturno");
            } else {
                if (planetaOrig == 90) {
                    System.out.println("Netuno");
                } else {
                    System.out.println("HD21749b");
                }
            }
        }

        //Planeta Destino
        if (planetaDes == 80) {
            System.out.println("Marte");
        } else {
            if (planetaDes == 81) {
                System.out.println("Saturno");
            } else {
                if (planetaDes == 90) {
                    System.out.println("Netuno");
                } else {
                    System.out.println("HD21749b");
                }
            }
        }


        //Disco voador

        if (codModelo == 60) {
            System.out.println("A6000");
        } else {
            if (codModelo == 61) {
                System.out.println("B7500");
            } else {
                System.out.println("C9000");
            }
        }

        
        entrada.close();
    }
    
}
