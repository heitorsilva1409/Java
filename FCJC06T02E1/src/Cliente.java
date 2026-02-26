public class Cliente {
    //atributos da classe Cliente
    private String cpfCliente;
    private String nomeCliente;

    //construtor de Cliente
    public Cliente(String nomeCliente, String cpfCliente) {
        this.cpfCliente = cpfCliente; //atributo cpfCliente vai receber o valor da variável cpfCliente declarada no construtor
        this.nomeCliente = nomeCliente; //atributo nomeCliente vai receber o valor da variável nomeCliente declarada no construtor
    }

    //método para ler o valor da variável nomeCliente
    public String getNomeCliente() {
        return nomeCliente;
    }
}
