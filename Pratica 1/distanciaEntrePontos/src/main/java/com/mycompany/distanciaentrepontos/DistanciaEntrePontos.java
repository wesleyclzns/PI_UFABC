package com.mycompany.distanciaentrepontos;

import java.util.Scanner;
import java.lang.Math;
public class DistanciaEntrePontos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double aX, aY, bX, bY, distancia;

        System.out.println("Digite o ponto Ax:");
        aX = entrada.nextDouble();
        System.out.println("Digite o ponto Ay:");
        aY = entrada.nextDouble();

        System.out.println("Digite o ponto Bx:");
        bX = entrada.nextDouble();
        System.out.println("Digite o ponto By:");
        bY = entrada.nextDouble();

        distancia = Math.sqrt(Math.pow((bX-aX), 2) + Math.pow((bY-aY), 2));
        System.out.println(String.format("%.2f", distancia));
        entrada.close();
    }
}
