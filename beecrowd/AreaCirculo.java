package beecrowd;

import java.io.IOException;
import java.math.*;
import java.util.*;

public class AreaCirculo {

    public static final double N = 3.14159;

    public static void main(String[] args) throws IOException {
        
        double areaCirculo, raio;
        
        Scanner teclado = new Scanner(System.in);
        raio = teclado.nextDouble();
        
        areaCirculo = N*Math.pow(raio,2);
        System.out.printf("A=%.4f\n",areaCirculo);
  
     }
}
