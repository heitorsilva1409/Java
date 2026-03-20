import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pedagio pedagio = new Pedagio();
        int opcao;

        do {
            System.out.println("1- Registrar passagem de moto");
            System.out.println("2- Registrar passagem de carro");
            System.out.println("3- Registrar passagem de caminhão");
            System.out.println("4- Listar veículos processados");
            System.out.println("5- Mostrar valor total arrecadado");
            System.out.println("6- Mostrar total de veículos processados");
            System.out.println("0- Encerrar");

            opcao = sc.nextInt();
            sc.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Digite a placa da moto");
                    String placaMoto = sc.nextLine();
                    System.out.println("Digite o modelo da moto");
                    String modeloMoto = sc.nextLine();
                    System.out.println("Digite a quantidade de eixos");
                    int qntEixoMoto = sc.nextInt();
                    pedagio.registrarVeiculo(new Moto(placaMoto, modeloMoto, qntEixoMoto));
                    break;


                case 2:
                    System.out.println("Digite a placa do Carro");
                    String placaCarro = sc.nextLine();
                    System.out.println("Digite o modelo do Carro");
                    String modeloCarro = sc.nextLine();
                    System.out.println("Digite a quantidade de eixos");
                    int qntEixoCarro = sc.nextInt();
                    pedagio.registrarVeiculo(new Carro(placaCarro, modeloCarro, qntEixoCarro));
                    break;

                case 3:
                    System.out.println("Digite a placa do Caminhão");
                    String placaCaminhao = sc.nextLine();
                    System.out.println("Digite o modelo do Caminhão");
                    String modeloCaminhao = sc.nextLine();
                    System.out.println("Digite a quantidade de eixos");
                    int qntEixoCaminhao = sc.nextInt();
                    pedagio.registrarVeiculo(new Caminhao(placaCaminhao, modeloCaminhao, qntEixoCaminhao));
                    break;

                case 4:
                    pedagio.listarVeiculos();
                    break;

                case 5:
                    pedagio.totalTarifas();
                    break;

                case 6:
                    pedagio.mostrarTotalVeiculos();
                    break;
                case 0:
                    System.out.println("Encerrando o programa!!!");
                    break;

                default:
                    System.out.println("Opção inválida!!!");
            }


        } while (opcao != 0);


    }
}