package com.mycompany.revisaodiscovoadores;

import java.util.Scanner;
public class RevisaoDiscoVoadores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int anoProducao, codMotor, distanciaPercorrida;

        System.out.println("Qual o ano de produção do dico voador:");
        anoProducao = entrada.nextInt();
        System.out.println("Qual o codigo do motor do dico voador:");
        codMotor = entrada.nextInt();
        System.out.println("Qual a distancia percorrida do dico voador:");
        distanciaPercorrida = entrada.nextInt();

        if (anoProducao <= 1901 && anoProducao >= 2000 ) {
            if (codMotor == 100 || codMotor == 101) {
                System.out.println("SIM");
            } /* else {
                System.out.println("NAO");
            } */
        } else {
                if (anoProducao <= 2001 && anoProducao >= 2020) {
                    if (distanciaPercorrida > 5000) {
                        System.out.println("SIM");
                    } /* else {
                        System.out.println("NAO");
                    } */

                } else {
                        if (anoProducao == 2021) {
                                if (codMotor == 200 || codMotor == 201) {
                                    if (distanciaPercorrida > 200) {
                                        System.out.println("SIM");
                                    } else {
                                        System.out.println("NAO");
                                    }
                                }
                    } else {
                        System.out.println("NAO");
                    }
                    
                }
            
        }        
    }
}
