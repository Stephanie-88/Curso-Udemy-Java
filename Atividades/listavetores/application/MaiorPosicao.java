package Atividades.listavetores.application;

import java.util.Scanner;;

public class MaiorPosicao {
    public static void main(String args[]){
        Scanner tc = new Scanner(System.in);
        int n;

        System.out.println("Quantos numeros voce vai digitar?");
        n = tc.nextInt();

        double []vect = new double[n];
        for(int i=0;i<n;i++){
            System.out.println("Digite um numero: ");
            vect[i] = tc.nextDouble();
        }

        double maior = 0;
        int posicao = 0;
        for(int i=0;i<n;i++){
            if(vect[i] > maior){
                maior = vect[i];
                posicao = i;
            }
        }

        System.out.println("\n");
        System.out.println("MAIOR VALOR = " + maior);
        System.out.println("POSICAO DO MAIOR VALOR = " + posicao);
    }
}
