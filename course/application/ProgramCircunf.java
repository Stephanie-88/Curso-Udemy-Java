package application;

import java.util.Scanner;

import util.Calculator;

public class ProgramCircunf {
    public static void main(String args[]) {
        Scanner tc = new Scanner(System.in);
        double raio;

        System.out.print("Enter radius: ");
        raio = tc.nextDouble();
        System.out.println("Circumference: " + Calculator.circunferencia(raio));
        System.out.println("Volume: " + Calculator.volume(raio));
        System.out.println("PI value: " + Calculator.PI);

        tc.close();
    }
}
