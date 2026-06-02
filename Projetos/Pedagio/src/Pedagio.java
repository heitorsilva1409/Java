import java.util.LinkedList;
import java.util.List;

public class Pedagio {
    List<Veiculo> veiculos = new LinkedList<>();
    private static int contador = 0;

    public void registrarVeiculo (Veiculo veiculo){
        if (veiculo.status) {
            veiculos.add(veiculo);
            contador++;
        }
    }
    public void listarVeiculos () {
        if (veiculos.isEmpty()) {
            System.out.println("Nenhum veículo para ser listado!");
            System.out.println();
        }
        else {
            for (Veiculo veiculo: veiculos) {
                System.out.println(veiculo);
            }
        }
    }
    public void totalTarifas () {
        double total = 0;
        for (Veiculo veiculo: veiculos) {
            total += veiculo.calcularTarifa();
        }
        System.out.printf("O valor total dos pedágios foi de: %.2f%n", total);
        System.out.println();
    }
    public void mostrarTotalVeiculos () {
        System.out.printf("O total de veículos processados foi de: %d%n", contador);
        System.out.println();
    }

}
