public class Tablet extends Equipamento{
    private boolean possuiCaneta;

    public Tablet(int idEquipamento, String marcaEquipamento, String modeloEquipamento, double valorBaseConserto, boolean possuiCaneta) {
        super(idEquipamento, marcaEquipamento, modeloEquipamento, valorBaseConserto);
        this.possuiCaneta = possuiCaneta;
    }

    @Override
    public String toString() {
        return String.format("Tipo: %s - ID: %s - Marca: %s - Modelo: %s - Valor: %.2f - Possui caneta: %s",
                getClass().getSimpleName(),
                idEquipamento,
                marcaEquipamento,
                modeloEquipamento,
                valorBaseConserto,
                possuiCaneta);
    }

    @Override
    public double calcularValorServico() {
        double valor = valorBaseConserto + 200;
        System.out.println("Valor cobrado por serviço em notebooks: R$ " + valor);
        return valor;
    }
}
