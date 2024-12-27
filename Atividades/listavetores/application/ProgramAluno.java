package Atividades.listavetores.application;

import java.util.*;

import Atividades.listavetores.entities.Aluno;

public class ProgramAluno {
    public static void main(String args[]) {
        Scanner tc =  new Scanner(System.in);
        int n;

        System.out.println("Quantos alunos serão digitados?");
        n = tc.nextInt();
        Aluno aluno[] = new Aluno[n];
        

        for(int i = 0; i < n; i++) {
            tc.nextLine();
            String nome;
            double n1;
            double n2;

            System.out.printf("Digite nome, primeira e segunda nota do %s aluno:", i+1);
            nome = tc.nextLine();
            n1 = tc.nextDouble();
            n2 = tc.nextDouble();
            aluno[i] = new Aluno(nome, n1, n2);
        }

        System.out.println("Alunos aprovados:");
        for(int i = 0; i < n; i++){
            if(aluno[i].Media()){
                System.out.println(aluno[i].getNome());
            }
        }

        tc.close();
    }
}
