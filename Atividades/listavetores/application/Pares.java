package Atividades.listavetores.application;

import java.util.*;

public class Pares {
    public static void main(String args[]){
        Scanner tc = new Scanner(System.in);
        int n;

        System.out.println("Quantos numeros voce vai digitar?");
        n = tc.nextInt();
        tc.nextLine();

        int []vect = new int[n];
        for(int i = 0;i < n;i++){
            System.out.println("Digite um numero: ");
            vect[i] = tc.nextInt();
        }

        int aux = 0;
        System.out.println("\n");
        System.out.println("NUMEROS PARES: ");
        for(int i=0;i<n;i++){
            if(vect[i]%2 == 0){
                System.out.print(vect[i] + " ");
                aux++;
            }
        }

        System.out.println("\n");
        System.out.println("QUANTIDADE DE PARES = " + aux);

        tc.close();
    }
}
