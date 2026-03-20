public abstract class Equipamento {
    protected int idEquipamento;
    protected String marcaEquipamento;
    protected String modeloEquipamento;
    protected double valorBaseConserto;

    public Equipamento(int idEquipamento, String marcaEquipamento, String modeloEquipamento, double valorBaseConserto) {
        this.idEquipamento = idEquipamento;
        this.marcaEquipamento = marcaEquipamento;
        this.modeloEquipamento = modeloEquipamento;
        this.valorBaseConserto = valorBaseConserto;
    }

    public double calcularValorServico(){
        return 0.00;
    }
}
