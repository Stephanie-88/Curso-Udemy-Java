package Atividades.fixacaosecao09.application;

import java.util.Scanner;

import Atividades.fixacaosecao09.entities.Conta;

public class Program {
    public static void main(String args[]) {
        Scanner tc = new Scanner(System.in);

        Conta conta;

        char opcao;

        System.out.println("Digite a conta do cliente: ");
        int numConta = tc.nextInt();
        System.out.println("Digite o nome do cliente: ");
        tc.nextLine(); //para pegar o "\n" digitado após o numero da conta
        String nome = tc.nextLine();

        System.out.println("O cliente possui valor para depósito inicial? s/n");
        opcao = tc.next().charAt(0);

        if(opcao == 's') {
            System.out.println("Digite o valor do depósito: ");
            double valor = tc.nextDouble();
            conta = new Conta(numConta, nome, valor);
        }
        else {
            conta = new Conta(numConta, nome);
        }

        System.out.println();
        System.out.println("Dados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.println("Digite um valor para depósito: ");
        double deposito = tc.nextDouble();
        conta.deposito(deposito);
        System.out.println("Dados atualizados da conta: ");
        System.out.println(conta);

        System.out.println();
        System.out.println("Digite um valor para depósito: ");
        double saque = tc.nextDouble();
        conta.saque(saque);;
        System.out.println("Dados atualizados da conta: ");
        System.out.println(conta);


        tc.close();

    }
}
