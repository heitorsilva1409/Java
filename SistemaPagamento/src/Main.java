import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        int opcao1;
        Cliente cliente = new Cliente(1000, 500);
        Lojista lojista = new Lojista(10000.00, 0.0);

        do {

            opcao = sc.nextInt();
            switch (opcao) {
                case 1:
                    opcao1 = sc.nextInt();
                    switch (opcao1) {
                        case 1:
                            double valor = sc.nextDouble();
                            MetodoPagamento pagamento = new Debito();
                            pagamento.realizarPagamento(cliente, lojista, valor);
                            break;
                        case 2:
                            valor = sc.nextDouble();
                            pagamento = new Credito();
                            pagamento.realizarPagamento(cliente, lojista, valor);
                            break;
                        case 3:
                            valor = sc.nextDouble();
                            pagamento = new Pix();
                            pagamento.realizarPagamento(cliente, lojista, valor);
                            break;
                    }
                    break;
                case 2:
                    lojista.adiantarSaldoPendente();
                    break;

                case 0:
                    break;
            }
        }
        while (opcao != 0);
    }
}