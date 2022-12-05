package com.mycompany.comparamatrizes;


public class ComparaMatrizes {

    public static void main(String[] args) {
        public static boolean compararMatrizes(int[][] matriz1, int[][] matriz2) {
            boolean matriz = false;
            
            if (matriz1.length == matriz2.length) {
                for (int i = 0; i < matriz1.length; i++) {
                    for (int j = 0; j < matriz1.length; j++) {
                        if (matriz2[i][j] == matriz1[i][j]*2) {
                            matriz = true;
                        } else{
                            if (matriz2[i][j] == matriz1[i][j]) {
                                matriz = false;
                            } else {
                                matriz = false;
                            }
                        }
                    }
                }
            } else {
                matriz = false;
            }
            

            return matriz;
        }
    }
}


