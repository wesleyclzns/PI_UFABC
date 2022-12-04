package com.mycompany.fabricadediscosvoadores;

import java.util.Scanner;

public class FabricaDeDiscosVoadores {//Programa {}
    
    public static int obterPrazoEntrega(int disco1, int disco2, int disco3) {
        // Este método deve retornar o prazo de entrega
        int prazo = 0;
        if (disco1 == disco2 & disco2 == disco3) {
            prazo = 5;
        } 
        else { 
            if (disco1 == disco2 & disco2 != disco3) {
            prazo = 15;
            } else {
                if (disco1 == disco3 & disco1 != disco2) {
                    prazo = 15;
                }
                else{
                    if (disco2 == disco3 & disco2 != disco1) {
                        prazo = 15;
                        
                    } else {if (disco1 != disco2 & disco2 != disco3) {
                        prazo = 30;
                    }
                        
                    }
                    
                }
                           
            }
            
        }
        return prazo;
    }
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int d1 = leitor.nextInt();
        int d2 = leitor.nextInt();
        int d3 = leitor.nextInt();
        int resultado = obterPrazoEntrega(d1, d2, d3);
        System.out.println("Disco1 = " + d1);
        System.out.println("Disco2 = " + d2);
        System.out.println("Disco3 = " + d3);
        System.out.println("Prazo de entrega = " + resultado);
        leitor.close();
    }
    
}