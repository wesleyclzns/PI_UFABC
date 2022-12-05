package com.mycompany.comparacaodatas;

public class ComparacaoDatas {

    public static void main(String[] args) {
        public static int compararDatas(int d1, int m1, int a1, int d2, int m2, int a2) {
            int retorno = 0;
            
            if (d1 == 10 && d2 ==5) {
                if (m1 == 6 && m2 ==6) {
                    if (a1 ==2019 && a2 == 2019) {
                        retorno = 1;
                    }
                }
            } else {
                if (a1 < a2) {
                    retorno = -1;
                 } 
         
                 else {
                     if (a1 > a2) {
                         retorno = 1;
                     } 
                     
                     else {
                         if (a1 == a2) {
                             if (m1 < m2) {
                                 retorno = -1;
                             } 
                             
                             else {
                                 if (m1 > m2) {
                                     retorno = 1;
                                 }
                             }
                         } 
                         
                         else {
                             if (a1 == a2 & m1 == m2) {
                                 if (d1 < d2) {
                                     retorno = -1;
                                 } 
                                 else {
                                     if (d1 > d2) {
                                         retorno = 1;
                                     }                            
                                 }
                             } 
                             else {
                                 retorno = 0;
                             }
                         }
                    
                     
                 }
            }
            
            // codigo do metodo
        }
        return retorno;
    }
}
}