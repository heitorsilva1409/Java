import java.util.Scanner;

public class FCJC05T05E1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float saldo = 200.0f;
        boolean condicao = true;

        while (condicao) {
            int operacao;
            operacao = entrada.nextInt();
            entrada.nextLine();

            switch (operacao){
                case 0:
                    condicao = false;
                    break;
                case 1:
                    System.out.printf("Saldo atual: R$ %.2f", saldo);
                    System.out.println();
                    break;
                case 2:
                    String depositoString = entrada.nextLine();
                    float valorDeposito = Float.parseFloat(depositoString.replace(",","."));
                    if (valorDeposito * 10 % 1 != 0) {
                        System.out.println("Não é possível depositar centavos");
                    }
                    else {
                        saldo += valorDeposito;
                        System.out.printf("Valor de R$ %.2f depositado. Saldo atual: R$ %.2f", valorDeposito, saldo);
                        System.out.println();
                    }
                    break;
                case 3:
                    String saqueString = entrada.nextLine();
                    float valorSaque = Float.parseFloat(saqueString.replace(",","."));
                    if (valorSaque > saldo) {
                        System.out.println("Saldo insuficiente");
                    }
                    else {
                        if (valorSaque * 10 % 1 != 0) {
                            System.out.println("Não é possível sacar centavos");
                        }
                        else {
                            saldo -= valorSaque;
                            System.out.printf("Valor de R$ %.2f sacado. Saldo atual: R$ %.2f", valorSaque, saldo);
                            System.out.println();
                        }
                    }
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}