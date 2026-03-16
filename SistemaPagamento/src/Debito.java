public class Debito implements MetodoPagamento{
    @Override
    public String realizarPagamento(Cliente cliente, Lojista lojista, double valor) {
        double valorTaxa = valor * 2.5 / 100;
        if (cliente.getSaldo() > 0 && cliente.getSaldo() >= valor) {
            cliente.pagar(valor);
            lojista.receber(valor - valorTaxa);
            System.out.printf("Saldo do cliente: R$ %.2f%nSaldo do lojista: R$ %.2f%n", cliente.getSaldo(), lojista.getSaldo());
        }
        else System.out.println("Saldo insuficiente");
        return "";
    }
}