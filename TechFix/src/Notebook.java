public class Notebook extends Equipamento{
    private boolean possuiSSD;

    public Notebook(int idEquipamento, String marcaEquipamento, String modeloEquipamento, double valorBaseConserto, boolean possuiSSD) {
        super(idEquipamento, marcaEquipamento, modeloEquipamento, valorBaseConserto);
        this.possuiSSD = possuiSSD;
    }

    @Override
    public String toString() {
        return String.format("Tipo: %s - ID: %s - Marca: %s - Modelo: %s - Valor: %.2f - Possui SSD: %s",
                getClass().getSimpleName(),
                idEquipamento,
                marcaEquipamento,
                modeloEquipamento,
                valorBaseConserto,
                possuiSSD);
    }

    @Override
    public double calcularValorServico() {
        double valor = valorBaseConserto +  350;
        System.out.println("Valor cobrado por serviço em notebooks: R$ " + valor);
        return valor;
    }
}
