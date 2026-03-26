import domain.animal.Animal;
import domain.animal.Cachorro;
import domain.animal.Gato;
import domain.funcionario.Funcionario;
import service.GerenciadorAgenda;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();
        funcionario.adicionarFuncionarios();

        int opcao;
        do {
            System.out.println("Digite o que deseja fazer:\n1. Atendimento | 0. Encerrar");
            opcao = sc.nextInt();
            sc.nextLine();
            if (opcao == 1) {
                System.out.println("============CADASTRO DE ANIMAL============");
                System.out.println("Selecione o tipo de animal:\n1. Gato | 2. Cachorro");
                int tipoAnimal = sc.nextInt();
                sc.nextLine();
                System.out.println("Nome: ");
                String nome = sc.nextLine();
                System.out.println("Idade do animal: ");
                int idade = sc.nextInt();
                sc.nextLine();
                System.out.println("Tipo de pelo\n(0 - Sem pelo | 1 - Curto | 2 - Médio | 3 - Grande):");
                int tipoPelo = sc.nextInt();
                sc.nextLine();
                System.out.println("Nome do tutor: ");
                String nomeTutor = sc.nextLine();

                int porteCachorro;

                Animal animal;

                if (tipoAnimal == 1) {
                    System.out.println("O gato é acostumado com agua? S/N");
                    String resposta = sc.nextLine();
                    boolean acostumadoAgua;
                    if (resposta.toUpperCase().startsWith("S")) {
                        acostumadoAgua = true;
                    } else {
                        acostumadoAgua = false;
                    }
                    animal = new Gato(nome, idade, tipoPelo, nomeTutor, acostumadoAgua);
                } else {
                    System.out.println("Qual o porte do cachorro?\n1 - Pequeno | 2 - Médio | 3 - Grande | 4 - Gigante");
                    porteCachorro = sc.nextInt();
                    sc.nextLine();
                    animal = new Cachorro(nome, idade, tipoPelo, nomeTutor, porteCachorro);
                }

                System.out.println("Qual serviço deseja?\n" +
                        "1. Banho\n" +
                        "2. Banho e Tosa");

                int servico = sc.nextInt();
                sc.nextLine();

                if (funcionario.verificarDisponibilidade(servico)) {
                    System.out.println("Digite uma data para agendamento: (formato dd/MM/yyyy HH:mm)");
                    String entrada = sc.nextLine();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
                    LocalDateTime dataLocal = LocalDateTime.parse(entrada, formatter);
                    OffsetDateTime dataConvertida = dataLocal.atOffset(ZoneOffset.of("-03:00"));

                    System.out.println("Agendado para: " + dataConvertida);

                    GerenciadorAgenda gerenciadorAgenda = new GerenciadorAgenda();
                    double precoTotal = gerenciadorAgenda.calcularPreco(servico, animal);

                    System.out.printf("Preço do serviço: R$ %.2f%nDeseja continuar o atendimento? ", precoTotal);
                    String resposta = sc.nextLine();


                    OffsetDateTime ultimoAtendimento;
                    if (resposta.toUpperCase().startsWith("S")) {
                        System.out.println("Atendimento realizado com sucesso!");
                        ultimoAtendimento = OffsetDateTime.now();
                    } else {
                        System.out.println("Atendimento cancelado!");
                    }
                } else {
                    System.out.println("Sem funcionários disponíveis no momento! Volte mais tarde");
                }
            }
        } while(opcao != 0);
    }
}