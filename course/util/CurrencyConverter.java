package util;

public class CurrencyConverter {
    public static double IOF = 0.06;
   
    public static double conversor(double dollar, double quant) {
        return dollar * quant * (1 + IOF);
    }
}
