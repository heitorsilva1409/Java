public class Produto {
    //atributos da classe Produto
    private int idProduto;
    private String nomeProduto;
    private float precoProduto;

    //construtor de Produto
    public Produto(int idProduto, String nomeProduto, float precoProduto) {
        this.idProduto = idProduto; //atributo idProduto recebe o valor de idProduto recebido no parâmetro do construtor
        this.nomeProduto = nomeProduto; //atributo nomeProduto recebe o valor de nomeProduto recebido no parâmetro do construtor
        this.precoProduto = precoProduto; //atributo precoProduto recebe o valor de precoProduto recebido no parâmetro do construtor
    }

    //método para ler o valor do idProduto
    public int getIdProduto() {
        return idProduto;
    }

    //método para ler o valor de nomeProduto
    public String getNomeProduto() {
        return nomeProduto;
    }

    //método para ler o valor de precoProduto
    public float getPrecoProduto() {
        return precoProduto;
    }
}