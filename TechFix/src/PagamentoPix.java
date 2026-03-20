public class PagamentoPix implements FormaPagamento{
    public PagamentoPix() {
    }

    @Override
    public void pagar(double valor) {
        valor -= valor * 5 / 100;
        System.out.printf("Pagamento via Pix no valor de %.2f realizado!", valor);
    }
}
