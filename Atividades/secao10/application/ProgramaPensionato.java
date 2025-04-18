package Atividades.secao10.application;

import Atividades.secao10.entities.AlunoPensionato;

import java.util.Scanner;

public class ProgramaPensionato {
    public static void main(String[] args) {

        String nome, email;
        int quarto, n;
        Scanner tc = new Scanner(System.in);

        AlunoPensionato vet[] = new AlunoPensionato[10];

        System.out.println("Quantos quartos deseja alugar?");
        n = tc.nextInt();

        for(int i=0; i < n; i++) {
            tc.nextLine();
            System.out.println("Hospede " + (i+1) + ":");
            System.out.print("Nome: ");
            nome = tc.nextLine();
            System.out.print("Email: ");
            email = tc.nextLine();
            System.out.print("Quarto: ");
            quarto = tc.nextInt();
            System.out.println();

            AlunoPensionato aluno = new AlunoPensionato(nome, email);

            if(vet[quarto] == null) {
                vet[quarto] = aluno;
            }else{
                System.out.println("Esse quarto já está ocupado! Escolha outra instalação!");
                i--;
            }
        }
        System.out.println();
        System.out.println("Quartos ocupados:");
        System.out.println();
        for(int i=0; i < 10; i++) {
            if(vet[i] != null) {
                System.out.println(i + ": " + vet[i]);
            }
        }
    }
}
