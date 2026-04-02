import java.util.LinkedList;

public abstract class Equipamento {
    protected int idEquipamento = 0;
    protected String marcaEquipamento;
    protected String modeloEquipamento;
    protected double valorBaseConserto;
    protected LinkedList<Equipamento> equipamentos = new LinkedList<>();

    public Equipamento(int idEquipamento, String marcaEquipamento, String modeloEquipamento, double valorBaseConserto) {
        this.idEquipamento = idEquipamento;
        this.marcaEquipamento = marcaEquipamento;
        this.modeloEquipamento = modeloEquipamento;
        this.valorBaseConserto = valorBaseConserto;
    }

    public double calcularValorServico() {
        return 0.00;
    }

    public void adicionarEquipamento(Equipamento equipamento) {
        equipamentos.add(equipamento);
        System.out.println("Equipamento adicionado com sucesso!");
        idEquipamento++;
    }

    public void listarEquipamentos() {
        for (Equipamento equipamento : equipamentos) {
            System.out.println(equipamento);
        }
    }
}
