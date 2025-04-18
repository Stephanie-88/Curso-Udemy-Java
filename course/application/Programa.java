package application;

import java.util.*;

import entities.Triangulo;

public class Programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner teclado = new Scanner(System.in);

        Triangulo x, y;

        x = new Triangulo();
        y = new Triangulo();


        System.out.println("Digite os lados do primeiro triangulo: ");
        x.a = teclado.nextDouble();
        x.b = teclado.nextDouble();
        x.c = teclado.nextDouble();

        double areaX = x.area();

        System.out.println("Digite os lados do segundo triangulo: ");
        y.a = teclado.nextDouble();
        y.b = teclado.nextDouble();
        y.c = teclado.nextDouble();

        double areaY = y.area();



        maiorArea(areaX, areaY);

        teclado.close();
    }

    public static void maiorArea(double a, double b){
        if(a > b) {
            System.out.println("O maior triangulo é o primeiro com area: " + a);
        }
        else {
            System.out.println("O maior triangulo é o segundo com area: " + b);
        }
    }
}
