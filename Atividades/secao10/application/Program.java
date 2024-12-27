package Atividades.secao10.application;

import java.util.Scanner;

import Atividades.secao10.entities.Produto;

public class Program {
    public static void main(String args[]) {
        Scanner tc = new Scanner(System.in);

        int n = tc.nextInt();
        Produto[] vect = new Produto[n];

        for(int i=0; i<vect.length; i++){
            tc.nextLine();
            String name = tc.nextLine();
            double preco = tc.nextDouble();
            vect[i] = new Produto(name, preco);
        }

        double soma = 0;

        for(int i=0;i<vect.length;i++){
            soma += vect[i].getPreco();
        }

        double media = soma / vect.length;

        System.out.printf("Média = %.2f%n", media);

        tc.close();
    }
}
