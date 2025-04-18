package Atividades.listavetores.application;

import java.util.*;

public class Negativos {
    public static void main(String args[]) {
        int n;
        Scanner tc = new Scanner(System.in);

        System.out.println("Digite um número de 1  a 10:");
        n = tc.nextInt();

        System.out.println("Agora digite os números para preencher o vetor:");
        int []vect = new int[n];
        for(int i = 0; i < n; i++){
            System.out.print("Digite um numero:");
            vect[i] = tc.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS");
        for(int i = 0;i < n; i++) {
            if(vect[i] < 0) System.out.println(vect[i]);
        }
        System.out.println();

        tc.close();
    }
}
