import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        JTextField login = new JTextField();
        JTextField senha = new JTextField();
        Object[] campos = {
                "Login:", login,
                "Senha:", senha
        };
        int opcao = JOptionPane.showConfirmDialog(
                null,
                campos,
                "Cadastro",
                JOptionPane.OK_CANCEL_OPTION
        );
        if (opcao == JOptionPane.OK_OPTION) {
            Autenticador auth = new Autenticador();

            String loginFormatado = login.getText();
            String senhaFormatada = senha.getText();

            boolean loginValido = auth.validarLogin(loginFormatado);
            boolean senhaValida = auth.validarSenha(senhaFormatada);

            if (loginValido && senhaValida) {
                int operacao;
                sc.nextLine();

                do {
                    operacao = sc.nextInt();
                    System.out.println("1. Adicionar equipamento\n" +
                            "2. Listar equipamentos\n" +
                            "3. Encerrar\n" +
                            "4. Realizar Pagamento");

                    switch (operacao) {
                        case 1:
                            // Adicionar equipamento
                            break;
                        case 2:
                            // Listar equipamentos
                        case 3:
                            // Encerrar
                            break;
                        case 4:
                            // Realizar Pagamento
                    }
                } while (operacao != 0);
            }
            else {
                System.out.println("Login e/ou senha inválido(s)");
            }
        }
        else {
            System.out.println("Encerrando...");
        }

    }
}