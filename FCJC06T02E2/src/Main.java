import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Agencia agencia = new Agencia(1);

        Conta contaOrigem = new Conta(1, 1000, agencia);
        Conta contaDestino = new Conta(2, 500, agencia);

        boolean controle = true;


        while (controle) {
            System.out.println("Deseja fazer uma transferência?\n1 – Sim\n2 – Não");
            int operacao = sc.nextInt();
            sc.nextLine();

            if (operacao == 1) {
                float valor = sc.nextFloat();
                contaOrigem.fazerTransferencia(contaDestino, valor);
            }
            else {
                controle = false;
            }
        }
    }
}