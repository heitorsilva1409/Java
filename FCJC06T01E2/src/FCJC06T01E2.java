import java.math.BigInteger;
import java.util.Scanner;

public class FCJC06T01E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base = sc.nextInt();
        int expoente = sc.nextInt();
        BigInteger resultado = exponencial(base, expoente);

        System.out.println(resultado);
        sc.close();
    }

    public static BigInteger exponencial(int base, int expoente) {
        if (expoente == 0) {
            return BigInteger.ONE;
        }
        if (expoente % 2 == 1) {
            return exponencial(base, expoente - 1).multiply(BigInteger.valueOf(base));
        } else {
            return exponencial(base, expoente / 2).pow(2);
        }
    }
}