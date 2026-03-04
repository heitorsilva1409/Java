public class Transferencia {
    private int idTransferencia;
    private Conta contaOrigem;
    private Conta contaDestino;
    private String descricao;
    private float valorTransferencia;

    public Transferencia(int idTransferencia, Conta contaOrigem, Conta contaDestino, String descricao, float valorTransferencia) {
        this.idTransferencia = idTransferencia;
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        this.descricao = descricao;
        this.valorTransferencia = valorTransferencia;
    }

    public int getIdTransferencia() {
        return idTransferencia;
    }

    public Conta getContaOrigem() {
        return contaOrigem;
    }

    public Conta getContaDestino() {
        return contaDestino;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getValorTransferencia() {
        return valorTransferencia;
    }

    public void setIdTransferencia(int idTransferencia) {
        this.idTransferencia = idTransferencia;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValorTransferencia(float valorTransferencia) {
        this.valorTransferencia = valorTransferencia;
    }

    public void setContaOrigem(Conta contaOrigem) {
        this.contaOrigem = contaOrigem;
    }
}