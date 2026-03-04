import java.util.LinkedList;

public class Conta {
    private int numeroConta;
    private float saldo;
    private Agencia agencia;
    private LinkedList<Float> transferencias;

    public Conta(int numeroConta, float saldo, Agencia agencia) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.agencia = agencia;
        transferencias = new LinkedList<Float>();
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public float getSaldoConta() {
        return saldo;
    }

    public LinkedList<Float> getTransferencias() {
        return transferencias;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setTransferencias(LinkedList<Float> transferencias) {
        this.transferencias = transferencias;
    }

    public void fazerTransferencia(Conta contaDestino, float valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente");
            return;
        }
        saldo -= valor;
        contaDestino.setSaldo(contaDestino.getSaldoConta() + valor);
        System.out.printf(
                "Conta: %08d, Agência %04d fez uma transferência de R$ %.2f para a Conta: %08d, Agência %04d%nSaldo conta origem: R$ %.2f%nSaldo conta destino: R$ %.2f\n",
                getNumeroConta(), agencia.getIdAgencia(), valor, contaDestino.getNumeroConta(), agencia.getIdAgencia(), getSaldoConta(), contaDestino.getSaldoConta()
        );

        transferencias.add(valor);
    }
}