import java.util.LinkedList;
import java.util.List;

public class Pedagio {
    List<Veiculo> veiculos = new LinkedList<>();
    private static int contador = 0;

    public void registrarVeiculo (Veiculo veiculo){
        veiculos.add(veiculo);
        contador++;
    }
    public void listarVeiculos () {
        for (Veiculo veiculo: veiculos) {
            System.out.println(veiculo);
        }
    }
    public void totalTarifas () {
        double total = 0;
        for (Veiculo veiculo: veiculos) {
            total += veiculo.calcularTarifa();
        }
        System.out.printf("O valor total dos pedágios foi de: %.2f%n", total);
    }
    public void mostrarTotalVeiculos () {
        System.out.println("O total de veículos processados foi de: " + contador);
    }

}
