public class DescontoNatal implements Desconto {

    @Override
    public double aplicarDesconto(double valor) {
        valor -= (valor * 10 / 100);
        return valor;
    }
}
