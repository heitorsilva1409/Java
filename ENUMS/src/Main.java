import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido(1, new Date(), StatusPedido.ENVIADO);

        System.out.println(pedido);
    }
}