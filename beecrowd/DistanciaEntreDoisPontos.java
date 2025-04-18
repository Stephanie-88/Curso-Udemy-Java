package beecrowd;

import java.util.*;

public class DistanciaEntreDoisPontos {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        double x1, x2, y1, y2, dist;

        x1 = teclado.nextDouble();
        y1 = teclado.nextDouble();
        x2 = teclado.nextDouble();
        y2 = teclado.nextDouble();

        dist = Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));

        System.out.printf("%.4f\n",dist);
    }
}
