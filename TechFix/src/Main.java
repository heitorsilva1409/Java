import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int idEquipamento = 0;
        String marca;
        String modelo;
        double valorBaseConserto = 250;

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
                int operacao = -1;

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

                    Equipamento equipamento = null;

                    switch (operacao) {
                        case 1:
                            // Adicionar equipamento
                            System.out.println("Digite a marca do equipamento: ");
                            marca = sc.nextLine();
                            System.out.println("Digite o modelo do equipamento");
                            modelo = sc.nextLine();

                            System.out.println("Qual o tipo do equipamento? 1. Smartphone | 2. Tablet | 3. Notebook");
                            int tipoEquipamento = sc.nextInt();
                            sc.nextLine();
                            switch (tipoEquipamento) {
                                case 1:
                                    // Criar novo smartphone
                                    System.out.println("Qual a quantidade de câmeras do smartphone?");
                                    int qtdCameras = sc.nextInt();
                                    sc.nextLine();
                                    equipamento = new Smartphone(idEquipamento, marca, modelo, valorBaseConserto, qtdCameras);
                                    equipamento.adicionarEquipamento(equipamento);
                                    break;
                                case 2:
                                    // Criar novo tablet
                                    System.out.println("O tablet possui caneta? S/N");
                                    String possuiCanetaSimNao = sc.nextLine();
                                    boolean possuiCaneta = possuiCanetaSimNao.toUpperCase().startsWith("S");
                                    equipamento = new Tablet(idEquipamento, marca, modelo, valorBaseConserto, possuiCaneta);
                                    equipamento.adicionarEquipamento(equipamento);
                                    break;
                                case 3:
                                    // Criar novo notebook
                                    System.out.println("O notebook possui SSD? S/N");
                                    String possuiSSDString = sc.nextLine();
                                    boolean possuiSSD = possuiSSDString.toUpperCase().startsWith("S");
                                    equipamento = new Notebook(idEquipamento, marca, modelo, valorBaseConserto, possuiSSD);
                                    equipamento.adicionarEquipamento(equipamento);
                                    break;
                            }
                            break;
                        case 2:
                            // Listar equipamentos
                            if (equipamento.equipamentos.isEmpty()){
                                System.out.println("Lista de equipamentos vazia!");
                            } else {
                                equipamento.listarEquipamentos();
                            }

                            break;
                        case 3:
                            // Realizar Pagamento
                            break;
                        case 0:
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