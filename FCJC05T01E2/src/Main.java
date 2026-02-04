import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String saldoString = entrada.nextLine();
        float saldo = Float.parseFloat(saldoString.replaceAll("[^0-9,]","").replace(",","."));

        if (saldo >= 1.00){
            int operacaoBancaria = entrada.nextInt();
            entrada.nextLine();

            String saldoFormatado = String.valueOf(saldo).replace(".",",");

            switch(operacaoBancaria) {
                case 1:
                    System.out.println("Saldo atual: R$ " + saldoFormatado);
                    break;
                case 2:
                    String valorTransacaoString = entrada.nextLine();
                    float valorTransacao;
                    valorTransacao = Float.parseFloat(valorTransacaoString.replaceAll("[^0-9,]","").replace(",","."));

                    if (valorTransacao > saldo) {
                        System.out.printf("Valor do saque maior do que o saldo disponível: R$%.2f", saldo);
                    }
                    else if (valorTransacao < 1.00 || (valorTransacao * 100) % 1 != 0) {
                        System.out.println("Valor inválido para saque");
                    }
                    else {
                        saldo -= valorTransacao;
                        System.out.printf("Saldo atual: R$ %.2f", saldo);
                    }
                    break;
                case 3:
                    System.out.println("Encerrando a operação");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
        else {
            System.out.printf("Saldo atual: R$ %.2f", saldo);
        }
    }
}