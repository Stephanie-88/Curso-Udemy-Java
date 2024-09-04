package beecrowd;

import java.util.*;

public class Maior {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int A, B, C, maior;

        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();

       maior = (A + B + Math.abs(A-B))/2;
       maior = (maior + C + Math.abs(maior-C))/2;

       System.out.println(maior + " eh o maior");
    }
}
