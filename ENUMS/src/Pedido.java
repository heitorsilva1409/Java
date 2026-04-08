import jdk.jshell.Snippet;

import java.util.Date;

public class Pedido {
    private int id;
    private Date momentoPedido;
    private StatusPedido status;

    public Pedido() {
    }

    public Pedido(int id, Date momentoPedido, StatusPedido status) {
        this.id = id;
        this.status = status;
        this.momentoPedido = momentoPedido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getMomentoPedido() {
        return momentoPedido;
    }

    public void setMomentoPedido(Date momentoPedido) {
        this.momentoPedido = momentoPedido;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return String.format("ID do pedido: %d%nHora do pedido: %s%nStatus do pedido: %s", id, momentoPedido, status);
    }
}
