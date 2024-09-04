package beecrowd;

import java.util.*;

public class Area {

    public static final double PI = 3.14159;

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double A, B, C, areaTrianguloR, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo;

        A = teclado.nextDouble();
        B = teclado.nextDouble();
        C = teclado.nextDouble();

        areaTrianguloR = A * (C/2);
        areaCirculo = PI * Math.pow(C, 2);
        areaTrapezio =  (C * (A + B))/2;
        areaQuadrado = Math.pow(B, 2);
        areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f\n", areaTrianguloR);
        System.out.printf("CIRCULO: %.3f\n", areaCirculo);
        System.out.printf("TRAPEZIO:: %.3f\n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);
    }
}
