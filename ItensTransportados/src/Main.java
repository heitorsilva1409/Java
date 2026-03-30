import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Catalogo<String> catalogo = new Catalogo<>();
        int opcao;

        do {
            System.out.println("Digite o que deseja fazer: ");
            System.out.println("1. Adicionar item\n2. Listar itens\n3. Remover item por índice");
            opcao = sc.nextInt();
            sc.nextLine();


            switch (opcao) {
                case 1:
                    System.out.print("Digite o item que deseja adicionar: ");
                    String itemString = sc.nextLine();
                    catalogo.adicionar(itemString);
                    break;
                case 2:
                    catalogo.listarItens();
                    break;
                case 3:
                    System.out.print("Digite o índice do item que deseja remover: ");
                    int indice = sc.nextInt();
                    catalogo.remover(indice);
                    break;
            }
        } while (opcao != 0);
    }
}