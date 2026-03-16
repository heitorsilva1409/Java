import java.util.ArrayList;

public class Estacionamento {
    private int qtdVagas;
    private int contadorTotalVeiculos = 0;
    final private ArrayList<Veiculo> estacionados = new ArrayList<>(qtdVagas);

    public Estacionamento(int qtdVagas) {
        this.qtdVagas = qtdVagas;
    }

    public int getContadorTotalVeiculos() {
        return contadorTotalVeiculos;
    }

    public boolean verificarLotacao() {
        return estacionados.size() == qtdVagas;
    }

    public void entradaVeiculo(String placaVeiculo, String modeloVeiculo) {
        Veiculo veiculo = new Veiculo(placaVeiculo, modeloVeiculo);

        for (Veiculo veiculoAtual : estacionados) {
            if (placaVeiculo.equalsIgnoreCase(veiculoAtual.getPlacaVeiculo())) {
                System.out.println("Um veículo com esta placa já foi estacionado!");
                return;
            }
        }
        estacionados.add(veiculo);
        contadorTotalVeiculos++;
        System.out.println("Veículo estacionado!");
    }

    public void saidaVeiculo(String placaParaRemover) {
        for (int i = 0; i < estacionados.size(); i++) {
            Veiculo veiculoAtual = estacionados.get(i);
            if (placaParaRemover.equals(veiculoAtual.getPlacaVeiculo())) {
                estacionados.remove(veiculoAtual);
                System.out.println("Veículo deixou o estacionamento!");
            } else {
                System.out.println("Veículo não encontrado!");
            }
        }
    }

    public void listarVeiculosEstacionados() {
        if (!estacionados.isEmpty()) {
            for (Veiculo veiculoAtual : estacionados) {
                System.out.printf("%s - %s - %s%n",
                        veiculoAtual.getPlacaVeiculo().toUpperCase(),
                        veiculoAtual.getModeloVeiculo().toUpperCase(),
                        veiculoAtual.getHoraFormatada()
                );
            }
        } else {
            System.out.println("Nenhum veículo estacionado no momento!");
        }
    }

    public void esvaziarEstacionamento() {
        estacionados.clear();
        System.out.println("O estacionamento foi esvaziado!");
    }
}