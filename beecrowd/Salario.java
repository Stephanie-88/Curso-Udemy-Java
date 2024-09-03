package beecrowd;

import java.io.IOException;
import java.util.Scanner;

public class Salario {
     public static void main(String[] args) throws IOException {
 
        int numFuncionario, horas;
        double valorHora, salario;
        
        Scanner teclado = new Scanner(System.in);
        
        numFuncionario = teclado.nextInt();
        horas = teclado.nextInt();
        valorHora = teclado.nextDouble();
        
        salario = horas*valorHora;
        
        System.out.printf("NUMBER = %d\nSALARY = U$ %.2f\n",numFuncionario, salario);
        
        
 
    }
}
