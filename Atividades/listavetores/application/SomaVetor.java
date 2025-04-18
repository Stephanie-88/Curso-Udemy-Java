package Atividades.listavetores.application;

import java.util.Scanner;

public class SomaVetor {
    public static void main(String args[]){
        Scanner tc = new Scanner(System.in);
        int n;

        System.out.println("Quantos numeros voce vai digitar?");
        n = tc.nextInt();
        double []vect = new double[n];

        for(int i = 0;i < n;i++){
            System.out.print("Digite um numero:");
            vect[i] = tc.nextDouble();
        }
        System.out.print("\n");

        double soma = 0, media;
        System.out.print("VALORES = ");
        for(int i = 0;i < n;i++){
            System.out.print(vect[i] + " ");
            soma += vect[i];
        }
        System.out.print("\n");
        
        media = soma/n;
        System.out.println("SOMA = " + soma);
        System.out.println("MEDIA = " + media);

        tc.close();
    }
}
