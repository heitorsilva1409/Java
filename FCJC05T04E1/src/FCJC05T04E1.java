import java.util.Scanner;

public class FCJC05T04E1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String regex = "[^a-zA-Z0-9]";
        String frase = entrada.nextLine();
        String novaFrase ="";

        for (int i = 0; i < frase.length(); i++) {
            String letra = String.valueOf(frase.charAt(i));
            if (letra.matches(regex)) {
                continue;
            }
            System.out.println(letra);
            novaFrase += letra;
        }
        System.out.println(novaFrase);
    }
}