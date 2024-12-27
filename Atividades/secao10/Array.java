package Atividades.secao10;

import java.util.Scanner;

public class Array {
    public static void main(String args[]) {
        Scanner tc = new Scanner(System.in);

        System.out.println("Escolha quantos elementos terá o vetor: ");
        int n = tc.nextInt();
        double []vect = new double[n];

        System.out.printf("Um vetor de tamanho %s foi criado\n\n", n);

        for(int i=0; i < n; i++) {
            System.out.printf("Digite o elemento %s: \n", i+1);
            vect[i] = tc.nextDouble();
        }

        System.out.println("Elementos do vetor: ");

        for(int i=0; i < n; i++) {
            System.out.println(vect[i] + " ");
        }

        double soma = 0;
        for(int i=0; i < n; i++) {
            soma += vect[i];
        }
        double media = soma/n;
        
        System.out.println("Media: " + media);
    }
}
