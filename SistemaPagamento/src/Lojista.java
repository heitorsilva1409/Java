public class Lojista {
    protected double saldo;
    protected double saldoPendente;

    public Lojista(double saldo, double saldoPendente) {
        this.saldo = saldo;
        this.saldoPendente = saldoPendente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldoPendente() {
        return saldoPendente;
    }

    public void setSaldoPendente(double saldoPendente) {
        this.saldoPendente = saldoPendente;
    }

    public String adiantarSaldoPendente() {
        if (saldoPendente <= 0) {
            System.out.println("Não há saldo pendente");
        }
        else {
            setSaldoPendente(getSaldoPendente() - (getSaldoPendente() * 10.0 / 100));
            System.out.printf("Saldo do lojista: R$ %.2f", saldoPendente + saldo);
        }
        return "";
    }

    public void receber (double valor){
        saldo += valor;
    }
}
