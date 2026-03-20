public class Smartphone extends Equipamento{
    private int quantidadeCameras;

    public Smartphone(int idEquipamento, String marcaEquipamento, String modeloEquipamento, double valorBaseConserto, int quantidadeCameras) {
        super(idEquipamento, marcaEquipamento, modeloEquipamento, valorBaseConserto);
        this.quantidadeCameras = quantidadeCameras;
    }

    @Override
    public String toString() {
        return String.format("Tipo: %s - ID: %s - Marca: %s - Modelo: %s - Valor: %.2f - Quantidade de câmeras: %d",
                getClass().getSimpleName(),
                idEquipamento,
                marcaEquipamento,
                modeloEquipamento,
                valorBaseConserto,
                quantidadeCameras);
    }

    @Override
    public double calcularValorServico() {
        double valor = valorBaseConserto +  120;
        System.out.println("Valor cobrado por serviço em notebooks: R$ " + valor);
        return valor;
    }
}
