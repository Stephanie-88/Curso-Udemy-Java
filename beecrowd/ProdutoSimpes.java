package beecrowd;

import java.util.*;

public class ProdutoSimpes {
    
    public static void main(String[] args){
        int A, B, PROD;
        
        Scanner teclado = new Scanner(System.in);
        
        A = teclado.nextInt();
        B = teclado.nextInt();

        PROD = A * B;

        System.out.println("PROD = " + PROD);
    }
}
