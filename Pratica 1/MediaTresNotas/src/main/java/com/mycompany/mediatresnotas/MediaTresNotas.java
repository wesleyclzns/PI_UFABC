package com.mycompany.mediatresnotas;

import java.util.Scanner; 

public class MediaTresNotas {

    public static void main(String[] args) {
        double nota1, nota2, nota3, media;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite uma nota:");
        nota1 = entrada.nextDouble();
        System.out.println("Digite a proxima nota:");
        nota2 = entrada.nextDouble();
        System.out.println("Digite a ultima nota:");
        nota3 = entrada.nextDouble();
       
         
        media = (nota1 + nota2 + nota3)/3;
        System.out.println(String.format("%.2f",media));
        entrada.close();
    }
}
