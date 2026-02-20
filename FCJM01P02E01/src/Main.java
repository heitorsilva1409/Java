import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Float> historicoTransferencias = new LinkedList<>();
        float saldo = 2000;
        boolean controle = true;

        System.out.printf("Saldo inicial: R$ %.2f \n", saldo);

        while(controle) {
            System.out.println("Digite a opção de operação desejada\n0. Encerrar\n1. Atendimento ao cliente\n2. Transferência\n3. Listar transferências");
            int operacao = sc.nextInt();
            sc.nextLine();

            switch (operacao) {
                case 0:
                    System.out.println("Encerrando");
                    controle = false;
                    break;
                case 1:
                    System.out.println("Transferindo para o setor de atendimento ao cliente");
                    controle = false;
                    break;
                case 2:
                    System.out.println("Digite o valor da transferência(com vírgula): ");
                    String valorString = sc.nextLine();
                    float valor = Float.parseFloat(valorString.replace(",","."));
                    if (valor > saldo || valor < 0) {
                        System.out.println("Valor de transferência maior que saldo ou valor inválido!");
                    }
                    else {
                        saldo -= valor;
                        historicoTransferencias.add(valor);
                        System.out.printf("Transferência concluída com sucesso!\nNovo saldo: R$ %.2f\n", saldo);
                    }
                    break;
                case 3:
                    if (historicoTransferencias.isEmpty()) {
                        System.out.println("Não há registros de transferências!");
                    }
                    else{
                        for (float transferencia : historicoTransferencias) {
                            System.out.printf("R$ %.2f\n", transferencia);
                        }
                    }
                    break;
                default:
                    System.out.println("Operação inválida!");
                    break;
            }
        }
    }
}