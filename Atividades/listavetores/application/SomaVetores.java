package Atividades.listavetores.application;

import java.util.*;

public class SomaVetores {
    public static void main(String args[]){
        Scanner tc = new Scanner(System.in);
        int n;

        System.out.println("Quantos valores vai ter cada vetor?");
        n = tc.nextInt();

        System.out.println("Digite os valores do vetor A: ");
        int []vectA = new int[n];
        for(int i=0;i<n;i++){
            vectA[i] = tc.nextInt();
        }

        System.out.println("Digite os valores do vetor B: ");
        int []vectB = new int[n];
        for(int i=0;i<n;i++){
            vectB[i] = tc.nextInt();
        }

        System.out.println("VETOR RESULTANTE: ");
        int []vectC = new int[n];
        for(int i=0;i<n;i++){
            vectC[i] = vectA[i] + vectB[i];
            System.out.println(vectC[i]);
        }
        tc.close();
    }
}
