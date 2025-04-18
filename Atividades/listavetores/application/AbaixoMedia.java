package Atividades.listavetores.application;

import java.util.*;

public class AbaixoMedia {
    public static void main(String args[]){
        Scanner tc = new Scanner(System.in);
        int n;

        System.out.println("Quantos elementos vai ter o vetor?");
        n = tc.nextInt();
        double []vect = new double[n];

        double media = 0;
        for(int i=0;i<n;i++){
            System.out.print("Digite um numero:");
            vect[i] = tc.nextDouble();
            media +=vect[i];
        }

        media /= n;
        System.out.println("\n");
        System.out.printf("MEDIA DO VETOR = %.3f \n", media);
        System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
        for(int i=0;i<n;i++){
            if(vect[i] < media){
                System.out.println(vect[i]);
            }
        }
    }
}
