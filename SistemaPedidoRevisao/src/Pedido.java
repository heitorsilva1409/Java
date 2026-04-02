import java.util.LinkedList;
import java.util.List;

public abstract class Pedido {
    private static int numero;
    private double valor;
    private static final List<Pedido> pedidos = new LinkedList<>();

    public Pedido(double valor) {
        this.valor = valor;
        if (valor <= 0) {
            throw new ValorInvalidoException("Valor inválido!");
        }
        numero++;
    }

    public int getNumero() {
        return numero;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double calcularTotal(){
        return valor;
    }

    public static void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public static void listarPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("Não há registros de pedidos");
        } else {
            for (Pedido pedido : pedidos) {
                System.out.println(pedido);
            }
        }
    }
}
