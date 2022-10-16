package com.mycompany.comparacaodedatas;

import java.util.Scanner;
public class ComparacaoDeDatas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia1, dia2, mes1, mes2, ano1, ano2;


        System.out.println("Digite o Dia:");
        dia1 = entrada.nextInt();
        System.out.println("Digite o Mes:");
        mes1 = entrada.nextInt();
        System.out.println("Digite o Ano:");
        ano1 = entrada.nextInt();

        System.out.println("Digite o Dia:");
        dia2 = entrada.nextInt();
        System.out.println("Digite o Mes:");
        mes2 = entrada.nextInt();
        System.out.println("Digite o Ano:");
        ano2 = entrada.nextInt();

        if (ano1 < ano2) {
            System.out.println("DATA1");
        } 

        else {
            if (ano1 > ano2) {
                System.out.println("DATA2");
            } 
            
            else {
                if (ano1 == ano2) {
                    if (mes1 < mes2) {
                        System.out.println("DATA1");
                    } 
                    
                    else {
                        if (mes1 > mes2) {
                            System.out.println("DATA2");
                        }
                    }
                } 
                
                else {
                    if (ano1 == ano2 & mes1 == mes2) {
                        if (dia1 < dia2) {
                            System.out.println("DATA1");
                        } else {
                            if (dia1 > dia2) {
                                System.out.println("DATA2");
                            }                            
                        }
                    } else {
                        System.out.println("IGUAIS");
                    }
                }
           
            
        }

    }
    entrada.close();
}
}