package application;

import java.util.Scanner;

import util.CurrencyConverter;

public class ProgramDollar {
    public static void main(String args[]) {
        Scanner tc = new Scanner(System.in);

        double dollar, quantDollar;

        System.out.println("What is the dollar price?");
        dollar = tc.nextDouble();
        System.out.println("How many dollars will be bought?");
        quantDollar = tc.nextDouble();
        System.out.printf("Amount to be paid in reais = %.2f\n", CurrencyConverter.conversor(dollar, quantDollar));

        tc.close();
    }
}
