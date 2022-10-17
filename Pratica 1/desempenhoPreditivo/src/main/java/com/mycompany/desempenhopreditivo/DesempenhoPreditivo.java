package com.mycompany.desempenhopreditivo;

import java.util.Scanner;
public class DesempenhoPreditivo {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int vp, fn, fp, vn; 
        double acuracia, precisao, sensibilidade;

        System.out.println("Digite o VP");
        vp = entrada.nextInt();
        System.out.println("Digite o FN");
        fn = entrada.nextInt();
        System.out.println("Digite o FP");
        fp = entrada.nextInt();
        System.out.println("Digite o VN");
        vn = entrada.nextInt();


        acuracia = ((double)vp + (double)vn) / ((double)vp + (double)vn + (double)fp + (double)fn);
        precisao = (double)vp / ((double)vp + (double)fp);
        sensibilidade = (double)vp / ((double)vp + (double)fn);

        System.out.println(String.format("%.2f", acuracia));
        System.out.println(String.format("%.2f", precisao));
        System.out.println(String.format("%.2f", sensibilidade));
        entrada.close();
    }
}
