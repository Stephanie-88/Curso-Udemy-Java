package Atividades.listavetores.application;

import java.util.Scanner;

import Atividades.listavetores.entities.PessoaVelha;

public class ProgramMaisVelhos {
    public static void main(String args[]){
        Scanner tc = new Scanner(System.in);
        int n, maiorIdade = 0;
        String pessoaMaisVelha = null;
        

        System.out.println("Quantas pessoas voce vai digitar?");
        n = tc.nextInt();
        PessoaVelha []vect = new PessoaVelha[n];

        for(int i=0;i<n;i++){
            tc.nextLine();
            System.out.println("Dados da 1a pessoa: ");
            System.out.print("Nome: ");
            String nome = tc.nextLine();
            System.out.print("Idade: ");
            int idade = tc.nextInt();
            vect[i] = new PessoaVelha(nome, idade);

            if(maiorIdade < idade) {
                maiorIdade = idade;
                pessoaMaisVelha = nome;
            }
        }

        System.out.println("PESSOA MAIS VELHA: " + pessoaMaisVelha);

        tc.close();


    }
}
