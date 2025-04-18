package Atividades.listavetores.application;

import java.util.Scanner;

import Atividades.listavetores.entities.Pessoa;

public class ProgramAlturas {
    public static void main(String args[]) {
        Scanner tc = new Scanner(System.in);
        int n;

        System.out.println("Quantas pessoas serão digitadas?");
        n = tc.nextInt();
        Pessoa []vect = new Pessoa[n];

        for(int i = 0;i < n;i++){
            tc.nextLine();
            String name;
            int idade;
            double altura;
            System.out.println("Dados da " + (i+1) + "a pessoa:");
            System.out.print("Nome: ");
            name = tc.nextLine();
            System.out.print("Idade: ");
            idade = tc.nextInt();
            System.out.print("Altura: ");
            altura = tc.nextDouble();
            vect[i] = new Pessoa(name, idade, altura);
        }

        double media = 0;

        for(int i = 0;i < n;i++){
            media += vect[i].getAltura();
        }
        media /= n;
        System.out.println();
        System.out.println("Altura média: " + media);

        double porcentagem = 0;
        for(int i = 0;i < n;i++) {
            if(vect[i].getIdade() < 16) {
                porcentagem++;
            }
        }
        porcentagem = (porcentagem/n) * 100;
        System.out.println("Pessoas com menos de 16 anos: " + porcentagem + "%");
        for(int i = 0;i < n;i++) {
            if(vect[i].getIdade() < 16) {
                System.out.println(vect[i].getNome());
            }
        }

        tc.close();

    }
}
