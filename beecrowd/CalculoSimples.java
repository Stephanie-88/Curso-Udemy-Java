package beecrowd;

import java.util.Scanner;

public class CalculoSimples {
    
    public static void main(String[] args) {

        int codigo1, codigo2, numPeca1, numPeca2;
        double preco1, preco2, total;
        
        Scanner teclado = new Scanner(System.in);

        codigo1 = teclado.nextInt();
        numPeca1 = teclado.nextInt();
        preco1 = teclado.nextDouble();

        codigo2 = teclado.nextInt();
        numPeca2 = teclado.nextInt();
        preco2 = teclado.nextDouble();

        total = numPeca1*preco1 + numPeca2*preco2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    } 
}
