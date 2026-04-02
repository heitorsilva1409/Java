import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DescontoNatal descontoNatal = new DescontoNatal();
        DescontoVip descontoVip = new DescontoVip();

        int opcao;
        Pedido pedido;
        int tipoDesconto;
        double valor;
        double valorFinal;

        do {
            System.out.println("O que deseja fazer?");
            System.out.println("1. Registrar um novo Pedido Online - 2. Registrar um novo Pedido Loja - 3. Listar pedidos - 4. Teste Classe anônima - 0. Encerrar");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    while (true) {
                        try {
                            System.out.print("Valor do pedido: ");
                            valor = sc.nextDouble();
                            pedido = new PedidoOnline(valor);
                            break;
                        } catch (ValorInvalidoException e) {
                            System.out.println("Erro: " + e.getMessage() + ". Tente novamente.");
                        }
                    }
                    valor = pedido.calcularTotal();

                    System.out.println("Tipo de desconto: ");
                    System.out.println("1. Desconto de Natal - 2. Desconto VIP - 3. Sem desconto");
                    tipoDesconto = sc.nextInt();
                    sc.nextLine();

                    switch (tipoDesconto) {
                        case 1:
                            valorFinal = descontoNatal.aplicarDesconto(valor);
                            pedido.setValor(valorFinal);
                            break;
                        case 2:
                            valorFinal = descontoVip.aplicarDesconto(valor);
                            pedido.setValor(valorFinal);
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Opção inexistente!");
                            break;
                    }
                    Pedido.adicionarPedido(pedido);
                    System.out.println(pedido);
                    break;
                case 2:
                    // pedido loja
                    while (true) {
                        try {
                            System.out.print("Valor do pedido: ");
                            valor = sc.nextDouble();
                            pedido = new PedidoLoja(valor);
                            break;
                        } catch (ValorInvalidoException e) {
                            System.out.println("Erro: " + e.getMessage() + ". Tente novamente.");
                        }
                    }
                    valor = pedido.calcularTotal();

                    System.out.println("Tipo de desconto: ");
                    System.out.println("1. Desconto de Natal - 2. Desconto VIP - 0. Sem desconto");
                    tipoDesconto = sc.nextInt();
                    sc.nextLine();

                    switch (tipoDesconto) {
                        case 1:
                            valorFinal = descontoNatal.aplicarDesconto(valor);
                            pedido.setValor(valorFinal);
                            break;
                        case 2:
                            valorFinal = descontoVip.aplicarDesconto(valor);
                            pedido.setValor(valorFinal);
                            break;
                        case 0:
                            break;
                        default:
                            System.out.println("Opção inexistente!");
                            break;
                    }
                    Pedido.adicionarPedido(pedido);
                    System.out.println(pedido);
                    break;
                case 3:
                    Pedido.listarPedidos();
                    break;
                case 4:
                    ClasseAnonima classeAnonima = new ClasseAnonima();

                    System.out.print("Valor do pedido: ");
                    valor = sc.nextDouble();

                    valorFinal = classeAnonima.aplicarDesconto(valor);
                    pedido = new PedidoLoja(valorFinal);
                    Pedido.adicionarPedido(pedido);
                    System.out.println("Pedido anônimo realizado");
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
            }
        } while (opcao != 0);
    }
}
class ClasseAnonima implements Desconto{
    @Override
    public double aplicarDesconto(double valor) {
        valor -= (valor * 50 / 100);
        return valor;
    }
}