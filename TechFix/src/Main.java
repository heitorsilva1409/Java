import javax.swing.*;
import java.util.InputMismatchException;
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
                int operacao = 0;

                do {
                    try {
                        System.out.println("Digite a operação desejada: " +
                                "\n1. Adicionar equipamento\n" +
                                "2. Listar equipamentos\n" +
                                "3. Realizar Pagamento\n" +
                                "0. Encerrar");
                        operacao = sc.nextInt();
                    } catch (InputMismatchException e) {
                        sc.nextLine();
                        System.out.println("Entrada de operação inválida!");
                        continue;
                    }

                    switch (operacao) {
                        case 1:
                            // Adicionar equipamento
                            break;
                        case 2:
                            // Listar equipamentos
                            break;
                        case 3:
                            // Realizar Pagamento
                            break;
                        case 0:
                            // Encerrar
                            System.out.println("Encerrando...");
                            break;
                        default :
                            System.out.println("Opção inválida!");
                            break;
                    }
                } while (operacao != 0);
            }
            else {
                System.out.println("Login e/ou senha inválido(s)");
            }
        }
        else {
            System.out.println("Login cancelado!");
        }
    }
}