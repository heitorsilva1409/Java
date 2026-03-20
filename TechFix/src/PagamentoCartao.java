public class PagamentoCartao implements FormaPagamento{
    public PagamentoCartao() {
    }

    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento via cartão no valor de %.2f realizado!", valor);
    }
}
