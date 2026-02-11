import java.util.Scanner;

public class FCJC05T04E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        String novaFrase = "";

        for (int i = 0; i < frase.length(); i++) {
            String atual = String.valueOf(frase.charAt(i));
            if (atual.equals("@")) {
                break;
            }
            novaFrase += atual;
        }
        System.out.println(novaFrase);
    }
}