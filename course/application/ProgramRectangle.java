package application;

import java.util.Scanner;

import entities.Rectangle;

public class ProgramRectangle {
    public static void main(String args[]) {
        Scanner tc = new Scanner(System.in);
        Rectangle x = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        x.width = tc.nextDouble();
        x.height = tc.nextDouble();

        System.out.printf("AREA = %.2f\n", x.area());
        System.out.printf("PERIMETER = %.2f\n", x.perimeter());
        System.out.printf("DIAGONAL = %.2f\n", x.diagonal());

        tc.close();
    }
}
