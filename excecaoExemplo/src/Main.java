import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws TelefoneInvalidoException {
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Digite um telefone: ");
                String telefone = sc.nextLine();
                Telefone tel = new Telefone(telefone);

                tel.validarTelefone(telefone);
                System.out.println("Telefone válido!");
                break;

            } catch (TelefoneInvalidoException e) {
                System.out.println("Erro: telefone inválido. Tente de novo.");
            }
        }


    }
}


