import java.util.Scanner;

public class FCJC06T01E1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String strA = sc.nextLine();
        String strB = sc.nextLine();

        int a = Integer.parseInt(strA);
        int b = Integer.parseInt(strB);

        int mdc = calculoMDC(a , b);

        if (a == 0) {
            System.out.println("INDEFINIDO");
        }
        else {
            System.out.println("MDC: " + mdc);
        }
    }

    public static int calculoMDC(int a, int b) {

        if (b == 0) {
            return a;
        }
        else {
            return calculoMDC(b, a% b);
        }
    }
}