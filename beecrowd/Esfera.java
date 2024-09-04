package beecrowd;

import java.util.*;

public class Esfera {

    public static final double PI = 3.14159;

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double raio, volume;

        raio = teclado.nextDouble();

        volume = (4/3.0) * PI * Math.pow(raio, 3);

        System.out.printf("VOLUME = %.3f\n", volume);
    }
}
