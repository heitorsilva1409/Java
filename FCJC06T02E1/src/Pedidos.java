import java.util.Arrays;
import java.util.Comparator;

public class Pedidos {
    //atributos da classe Pedidos
    private int idPedido;
    private Cliente clientePedido;
    private Produto[] produtos;

    //construtor da classe Pedidos
    //alerta para a tipagem das variáveis clientePedido do tipo Cliente (para receber os atributos de cliente) e produtos (que é um Array do tipo Produto, para receber atributos da classe Produto
    public Pedidos(int idPedido, Cliente clientePedido, Produto[] produtos) {
        this.idPedido = idPedido; //atributo idPedido vai receber o valor de idPedido passado como parâmetro
        this.clientePedido = clientePedido; //atributo clientePedido vai receber o valor da clientePedido passado como parâmetro
        this.produtos = produtos; //atributo produtos vai receber o valor de produtos passado como parâmetro
    }

     //Método calculuarTotal()
     public void calcularTotal() {
         float total = 0;

         //para (variável prod do tipo Produto na lista "produtos")
         for (Produto prod : produtos) {
             total += prod.getPrecoProduto(); //variavel prod recebe o valor lido do getPrecoProduto
         }
         System.out.printf("O total do pedido %d, do cliente: %s é de R$ %.2f", idPedido, clientePedido.getNomeCliente(), total);
     }

     //Método listarProdutos()
     public void listarProdutos() {

        //se a quantidade de valores no Array produtos
         if (produtos.length == 0) {
             System.out.println("Não há produtos para esse pedido");
         }
         //para (váriavel prodAtual do tipo Produto na lista "produtos")
         for (Produto prodAtual : produtos) {
             System.out.printf("\nProduto: %s – Valor: R$ %.2f",
                     prodAtual.getNomeProduto(), //só é possível fazer o get por conta de prodAtual ser do tipo Produto
                     prodAtual.getPrecoProduto() //só é possível fazer o get por conta de prodAtual ser do tipo Produto
             );
         }
     }

    public void ordenar(){
        produtos = Arrays.stream(produtos)
                .sorted(Comparator.comparingInt(Produto::getIdProduto)) //
                .toArray(Produto[]::new); //transforma em outro Array do tipo Produto
    }
}