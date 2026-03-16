public class Credito implements MetodoPagamento {

    @Override
    public String realizarPagamento(Cliente cliente, Lojista lojista, double valor) {
        if (cliente.getLimite() <= 0 || cliente.getLimite() < valor) {
            System.out.println("Limite insuficiente");
            return "";
        }

        double taxa = valor * 0.05;
        double valorLiquido = valor - taxa;

        cliente.setLimite(cliente.getLimite() - valor);
        lojista.setSaldoPendente(lojista.getSaldoPendente() + valorLiquido);

        System.out.printf("Limite do cliente: R$ %.2f%n", cliente.getLimite());
        System.out.printf("Saldo pendente do lojista: R$ %.2f%n", lojista.getSaldoPendente());

        return "";
    }
}