package com.mycompany.encriptacao;

import java.util.Scanner;

public class Encriptacao 
{

    public static void main(String[] args) 
    {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, unid, dez, cent, milhar;
    
        //System.out.print("Digite um número inteiro de apenas 4 dígitos: ");
        num1 = entrada.nextInt();
    
        if (num1 <= 9999 && num1>=0)
        {
        
            unid = num1 % 10;
            num1 = num1 / 10;
            dez = num1 % 10;
            num1 = num1 / 10;
            cent = num1 % 10;
            milhar = num1 / 10;
        
            if (unid != 9)
            {
                unid = unid + 1;
            }
            else
            {
            unid = 0;
            }
        
            if (dez != 9)
            {
                dez = dez + 1;
            }
            else
            {
                dez = 0;
            }
        
            if (cent != 9)
            {
                cent = cent + 1;
            }
            else
            {
                cent = 0;
            }
             
            if (milhar != 9)
            {
                milhar = milhar + 1;
            }
            else
            {
                milhar = 0;
            }
        
            num2 = unid + (dez *10) + (cent*100) + (milhar * 1000);
        
            System.out.print(String.format("%04d", num2));
        
        }
            else
            {
                //System.out.print("Valor inválido!");
            }
    entrada.close();
    }
}