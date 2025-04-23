package Atividades.secao10.application;

import Atividades.secao10.entities.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaFuncionario {
    public static void main(String[] args){
        Integer id;
        String nome;
        double salario;
        Scanner tc = new Scanner(System.in);

        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.println("Quantos funcionários pretende registrar?");
        int n = tc.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.println("Funcionário " + (i+1) + "#:");
            System.out.print("Id: ");
            id = tc.nextInt();
            tc.nextLine();
            System.out.print("Nome: ");
            nome = tc.nextLine();
            System.out.print("Salário: ");
            salario = tc.nextDouble();
            System.out.println();

            funcionarios.add(new Funcionario(id, nome, salario));
        }

        System.out.print("Digite o id do funcionário que receberá aumento de salário:");
        id = tc.nextInt();
        boolean flag = false;
        for(Funcionario f1: funcionarios) {
            if(f1.getId().equals(id)){
                System.out.print("Digite a porcentagem aumentada:");
                Double porcentagem = tc.nextDouble();
                System.out.println();
                f1.Aumento(porcentagem);
                flag = true;
                break;
            }
        }

        if(!flag) {
            System.out.println("Funcionário não existe!");
        }


        System.out.println("Lista de funcionários:");
        for(Funcionario x: funcionarios){
            System.out.println(x);
        }
    }
}
