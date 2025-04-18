package application;

import java.util.Scanner;

import entities.Aluno;

public class ProgramAluno {
    public static void main(String args[]) {
        Scanner tc = new Scanner(System.in);
        Aluno aluno = new Aluno();
        double media;

        aluno.nome = tc.nextLine();
        aluno.nota1 = tc.nextDouble();
        aluno.nota2 = tc.nextDouble();
        aluno.nota3 = tc.nextDouble();

        media = aluno.media();

        System.out.println("FINAL GRADE = " + media);
        aluno.verificaAprovacao(media);

        tc.close();

    }
}
