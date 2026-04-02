public class DescontoVip implements Desconto {

    @Override
    public double aplicarDesconto(double valor) {
        valor -= (valor * 20 / 100);
        return valor;
    }
}
