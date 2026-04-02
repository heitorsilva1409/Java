import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ItemBiblioteca item;
        Map<String, ItemBiblioteca> mapeamentoItem = new HashMap<>();
        Boolean disponivelCadastro = false;

        int opcao;
        do {
            System.out.println("1. Verificar disponibilidade por nome | 2. Cadastrar Item | 3. Buscar item por nome | 0. Encerrar");
            opcao = sc.nextInt();
            sc.nextLine();
            String nomeBuscar;

            String tituloCadastro;

            switch (opcao) {

                case 1:
                    // Verificar disponibilidade por nome
                    System.out.println("Digite o nome do item que deseja verificar: ");
                    nomeBuscar = sc.nextLine();
                    if (disponivelCadastro) {
                        System.out.println(mapeamentoItem.get(nomeBuscar));
                    } else {
                        System.out.println("Item não encontrado");
                    }
                    break;
                case 2:
                    // Cadastrar item
                    System.out.println("Qual o tipo do item que vc deseja cadastra? 1. Livro | 2. Revista");
                    int tipoItem = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Digite o título do item: ");
                    tituloCadastro = sc.nextLine();
                    System.out.println("O item está disponível? s/n");
                    String resposta = sc.nextLine().toLowerCase();
                    disponivelCadastro = resposta.startsWith("s");

                    switch (tipoItem) {
                        // Cadastrar Livro
                        case 1:
                            item = new Livro(tituloCadastro, disponivelCadastro);
                            mapeamentoItem.put(tituloCadastro, item);
                            break;
                        // Cadastrar Revista
                        case 2:
                            item = new Revista(tituloCadastro, disponivelCadastro);
                            mapeamentoItem.put(tituloCadastro, item);
                            break;
                    }
                    break;

                case 3:
                    // Buscar item por nome
                    System.out.println("Digite o nome do item que deseja buscar: ");
                    nomeBuscar = sc.nextLine();

                    if (mapeamentoItem.isEmpty()) {
                        System.out.println("Não foi encontrado um item com esse título");
                        break;
                    } else {
                        if (mapeamentoItem.get(nomeBuscar) == null) {
                            System.out.println("Não há livros registrados");
                        } else {
                            System.out.println();
                        }
                    }
                    break;
                // Encerrar
                case 0:
                    break;
            }
        } while (opcao != 0);


    }
}