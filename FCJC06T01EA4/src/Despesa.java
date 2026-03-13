public class Despesa {
    public String nomeDespesa;
    public String descricao;
    public float valor;

    public Despesa() {
    }

    /*
    public Despesa(String nomeDespesa, String descricao, float valor) {
        this.nomeDespesa = nomeDespesa;
        this.descricao = descricao;
        this.valor = valor;
    }
     */


    public String getNomeDespesa() {
        return nomeDespesa;
    }

    public String getDescricao() {
        return descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setNomeDespesa(String nomeDespesa) {
        this.nomeDespesa = nomeDespesa;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}