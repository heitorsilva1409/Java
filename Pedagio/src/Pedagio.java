import java.util.LinkedList;

public class Pedagio {
    LinkedList<Veiculo> veiculos = new LinkedList<>();

    public void registrarVeiculos(String placaVeiculo, String modeloVeiculo, int qtdEixos){
        Veiculo veiculo = new Veiculo(placaVeiculo, modeloVeiculo, qtdEixos);
        veiculos.add(veiculo);
    }

    public void listarVeiculos() {
        for (Veiculo veiculo : veiculos) {
            System.out.printf("%s - %s - %s - %d - %s",

                    veiculo.getPlacaVeiculo(),
                    veiculo.getModelo(),
                    veiculo.getQtdEixos());
        }
    }
}
