public class Cliente {
    private int idCliente;
    private String nomeCliente;
    private String senhaCliente;
    private String loginCliente;

    public Cliente(int idCliente, String nomeCliente, String loginCliente, String senhaCliente) {
        this.idCliente = idCliente;
        this.loginCliente = loginCliente;
        this.nomeCliente = nomeCliente;
        this.senhaCliente = senhaCliente;
    }
}
