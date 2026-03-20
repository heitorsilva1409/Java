import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca b = new Biblioteca();

        int opcao;

        do {
            System.out.println("Digite a opção desejada: " +
                    "\n1. Registrar livro" +
                    "\n2. Registrar revista" +
                    "\n3. Registrar DVD" +
                    "\n4. Emprestar item por código" +
                    "\n5. Devolver item e informar dias de atraso" +
                    "\n6. Listar itens cadastrados" +
                    "\n7. Mostrar total arrecadado com multas" +
                    "\n8. Mostrar total de itens cadastrados" +
                    "\n0. Encerrar");
            opcao = sc.nextInt();
            sc.nextLine();

            ItemBiblioteca item;
            String codigo;
            String titulo;
            int anoPublicacao;

            switch (opcao) {

                case 1:
                    System.out.println("Digite o código do livro: ");
                    codigo = sc.nextLine();
                    System.out.println("Digite o título do livro: ");
                    titulo = sc.nextLine();
                    System.out.println("Digite o ano de publicação do livro: ");
                    anoPublicacao = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o nome do autor do livro: ");
                    String autorLivro = sc.nextLine();

                    item = new Livro(codigo, titulo, anoPublicacao, autorLivro);

                    b.cadastrarItem(item);
                    break;
                case 2:
                    System.out.println("Digite o código da revista: ");
                    codigo = sc.nextLine();
                    System.out.println("Digite o título da revista: ");
                    titulo = sc.nextLine();
                    System.out.println("Digite o ano de publicação da revista: ");
                    anoPublicacao = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite o número da edição da revista: ");
                    int edicaoRevista = sc.nextInt();
                    sc.nextLine();

                    item = new Revista(codigo, titulo, anoPublicacao, edicaoRevista);

                    b.cadastrarItem(item);
                    break;
                case 3:
                    System.out.println("Digite o código do DVD: ");
                    codigo = sc.nextLine();
                    System.out.println("Digite o título do DVD: ");
                    titulo = sc.nextLine();
                    System.out.println("Digite o ano de publicação do DVD: ");
                    anoPublicacao = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Digite os minutos de duração do DVD: ");
                    int duracaoMinutos = sc.nextInt();
                    sc.nextLine();

                    item = new DVD(codigo, titulo, anoPublicacao, duracaoMinutos);

                    b.cadastrarItem(item);
                    break;
                case 4:
                    //Em desenvolvimento
                    System.out.println("Emprestar item por código");
                    break;
                case 5:
                    System.out.println("Digite o código do Item");
                    codigo = sc.nextLine();
                    System.out.println("Digite os dias de atraso");
                    int diasAtraso = sc.nextInt();
                    double multa = b.devolverItem(codigo, diasAtraso);
                    System.out.printf("A multa foi de: R$ %.2f%n", multa);
                    break;
                case 6:
                    b.listarItens();
                    break;
                case 7:
                    //Em desenvolvimento, ainda falta testar depois de adicionar multas
                    System.out.printf("O total arrecadado foi de: R$ %.2f%n", b.getTotalMultasArrecadadas());
                    break;
                case 8:
                    System.out.println("O total de itens cadastrados é de: " + ItemBiblioteca.getTotalItensCadastrados());
                    break;
            }
        } while (opcao != 0);
    }
}