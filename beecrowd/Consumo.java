package beecrowd;

import java.util.*;

public class Consumo {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double X, Y, consumo;

        X = teclado.nextDouble();
        Y = teclado.nextDouble();

        consumo = X/Y * 1.0;

        System.out.printf("%.3f km/l\n",consumo);

    }
}
