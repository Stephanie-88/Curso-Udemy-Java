package beecrowd;

import java.util.*;

public class SalarioComBonus {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);
        String nome;
        double salario, vendas, total;

        nome = teclado.nextLine();
        salario = teclado.nextDouble();
        vendas = teclado.nextDouble();

        total = salario + vendas * 0.15;
        System.out.printf("TOTAL = R$ %.2f", total);
    }
}
