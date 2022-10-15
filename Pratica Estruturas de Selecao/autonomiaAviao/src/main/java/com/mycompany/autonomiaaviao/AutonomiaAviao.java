package com.mycompany.autonomiaaviao;

import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
public class AutonomiaAviao {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int carga;
        double Ax, Ay, Bx, By, distancia;
        boolean carga1, carga2, carga3;

        System.out.println("Digite a Carga: ");
        carga = entrada.nextInt();
        System.out.println("Digite o ponto A X:");
        Ax = entrada.nextDouble();
        System.out.println("Digite o ponto A Y:");
        Ay = entrada.nextDouble();
        System.out.println("Digite o ponto B X:");
        Bx = entrada.nextDouble();
        System.out.println("Digite o ponto B Y:");
        By = entrada.nextDouble();

        carga1 = carga <= 50000;
        carga2 = carga > 50000 && carga <= 200000;
        carga3 = carga > 200000 && carga <= 250000;

        distancia = sqrt((pow(Bx-Ax, 2)) + (pow(By-Ay, 2)));
        System.out.println("A distancia entre A e B é: ");
        System.out.println(String.format("%.2f", distancia));

        if (carga1 && distancia <=18000) {
            System.out.println("SIM");

        } else  { 
            if (carga1 && distancia > 18000 && distancia <=19800){
                System.out.println("TALVEZ");
            } else{
                if (carga2 && distancia <= 9000) {
                    System.out.println("SIM");
                } else {
                    if (carga2 && distancia > 9000 && distancia <= 9900) {
                        System.out.println("TALVEZ");
                    } else {
                        if (carga3 && distancia <= 3000) {
                            System.out.println("SIM");
                        } else {
                            if (carga3 && distancia > 3000 && distancia <= 3300) {
                                System.out.println("TALVEZ");
                            } else {
                                System.out.println("NAO");
                            }
                        }
                    }
                    
                }
            }

            
        }
        entrada.close();

    }
}
