public class Clientee {
    private String cpfCliente;
    private String nomeCliente;

    public Clientee(String cpfCliente, String nomeCliente) {
        this.cpfCliente = cpfCliente;
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
}
