import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nomeCli = sc.nextLine(); //variável nome que será utilizada mais tarde como parâmetro no objeto novoCliente
        String cpfCli = sc.nextLine(); //variável cpf que será utilizada mais tarde como parâmetro no objeto novoCliente
        Cliente novoCliente = new Cliente(cpfCli, nomeCli); //objeto do tipo Cliente que recebe cpf e nome. A ordem em que os parâmetros são passados é muito importante

        int qtdProdutos = sc.nextInt();
        sc.nextLine();

        //Array prods do tipo Produto (para poder receber os ATRIBUTOS da classe Produto
        Produto[] prods = new Produto[qtdProdutos];

        for (int i = 0 ; i  < qtdProdutos ; i++) {
            int idProd = sc.nextInt(); //variável idProd que será utilizada mais tarde como parâmetro no Array prods
            sc.nextLine();
            String nomeProd = sc.nextLine(); //variável nomeProd que será utilizada mais tarde como parâmetro no Array prods
            float precoProd = sc.nextFloat(); //variável precoProd que será utilizada mais tarde como parâmetro no Array prods
            sc.nextLine();

            //Array prods[índice] = novo objeto do tipo Produto seguido das varíáveis que foram coletadas agora, respeitando a ordem definida no construtor da classe Produto
            prods[i] = new Produto(idProd, nomeProd, precoProd);
        }

        //objeto do tipo Pedidos = novo Pedido seguido dos parâmetros coletados respeitando a ordem de tipagem definida na classe Pedidos
        Pedidos pedidos = new Pedidos(1, novoCliente, prods);
        pedidos.ordenar(); //chama o método ordenar()
        pedidos.calcularTotal(); //chama o método calcularTotal()
        sc.close(); //fecha o Scanner
        pedidos.listarProdutos(); //chama o método listarProdutos()
    }
}