package beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Diferenca1 {
    public static void main(String[] args) throws IOException {
 
        int A, B, C, D, DIFERENCA;
        
        Scanner teclado = new Scanner(System.in);
        
        A = teclado.nextInt();
        B = teclado.nextInt();
        C = teclado.nextInt();
        D = teclado.nextInt();
        
        DIFERENCA = A * B - C * D;
        
        System.out.println("DIFERENCA = " + DIFERENCA);
 
    }
}
