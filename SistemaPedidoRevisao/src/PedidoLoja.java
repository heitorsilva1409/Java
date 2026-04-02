public class PedidoLoja extends Pedido{
    public PedidoLoja(double valor) {
        super(valor);
    }

    @Override
    public double calcularTotal() {
        setValor(getValor());
        return getValor();
    }

    @Override
    public String toString(){
        return String.format("Tipo de pedido: %s - Número do pedido: %d - Valor do pedido: %.2f",
                getClass().getSimpleName(),
                getNumero(),
                getValor());
    }
}