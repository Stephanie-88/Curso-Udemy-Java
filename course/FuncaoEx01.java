import java.util.*;

public class FuncaoEx01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a, b, c;

        System.out.println("Digite 3 números:");

        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();

        int maior = max(a, b, c);
        showResult(maior);
        


        teclado.close();
    }

    public static int max(int a, int b, int c) {
        int maior;

        if(a < b) {
            maior = b;
        }
        else if(a < c) {
            maior = c;
        }
        else {
            maior = a;
        }

        return maior;
    }

    public static void showResult(int valor) {
        System.out.println("O maior valor é: " + valor);
    }
}
