import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de vagas: ");
        int qtdVagas = sc.nextInt();
        sc.nextLine();

        while (qtdVagas <= 0) {
            System.out.println("Não são permitidos números menores ou iguais à zero!" +
                    "\nTente novamente");
            qtdVagas = sc.nextInt();
        }
        Estacionamento estacionamento = new Estacionamento(qtdVagas);

        int opcao;
        do {
            System.out.println("Digite a opção");
            System.out.printf("1. Registrar entrada de veiculo%n" +
                    "2. Registrar saida de veiculo%n" +
                    "3. Listar veiculos estacionados%n" +
                    "4. Mostrar total de veiculos que ja utilizaram o estacionamento%n" +
                    "5. Esvaziar Estacionamento%n" +
                    "0. Encerrar%n"
            );
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                // Adicionar veículo
                case 1:
                    if (!estacionamento.verificarLotacao()) {
                        System.out.println("Digite a placa do carro: ");
                        String placa = sc.nextLine().replaceAll("[^a-zA-z0-9]","#");
                        System.out.println("Digite o modelo do carro: ");
                        String modelo = sc.nextLine();
                        estacionamento.entradaVeiculo(placa, modelo);
                    }
                    else {
                        System.out.println("Estacionamento lotado! Volte mais tarde");
                    }
                    break;
                // Registrar saída de veículo
                case 2:
                    System.out.println("Digite a placa do veículo sairá do estacionamento: ");
                    String placaParaRemover = sc.nextLine();
                    estacionamento.saidaVeiculo(placaParaRemover);
                    break;
                // Listar veículos estacionados
                case 3:
                    estacionamento.listarVeiculosEstacionados();
                    break;
                // Mostrar total de veículos que já utilizaram o estacionamento
                case 4:
                    System.out.println("Total de veículos: " + estacionamento.getContadorTotalVeiculos());
                    break;
                // Extra Limpar a lista
                case 5:
                    estacionamento.esvaziarEstacionamento();
                    break;
                // Encerrar
                case 0:
                    System.out.println("Encerrando...");
                    break;
                // Valor padrão
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao !=0);
    }
}
