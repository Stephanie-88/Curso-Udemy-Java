package Atividades.listavetores.application;

import java.util.*;

public class MdiaPares {
    public static void main(String args[]){
        Scanner tc = new Scanner(System.in);
        int n, aux =0;
        double media = 0;

        System.out.println("Quantos elementos vai ter o vetor?");
        n = tc.nextInt();
        int []vect = new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Digite um numero:");
            vect[i] = tc.nextInt();
            if(vect[i]%2 == 0){
                media += vect[i];
                aux++;
            }
        }

        if(aux == 0) {
            System.out.println("NENHUM NUMERO PAR ");
        }
        else {
            media /= aux;
            System.out.printf("MEDIA DOS PARES = %.1f\n",media);
        }

        tc.close();
    }


}
