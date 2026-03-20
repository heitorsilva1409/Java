import java.util.LinkedList;

public class OrdemServico {
    private int idOrdemServico;
    private String status;
    private String descricaoDefeito;
    private LinkedList<Equipamento> equipamentos = new LinkedList<>();

    public OrdemServico(String descricaoDefeito, LinkedList<Equipamento> equipamentos, int idOrdemServico, String status) {
        this.descricaoDefeito = descricaoDefeito;
        this.equipamentos = equipamentos;
        this.idOrdemServico = idOrdemServico;
        this.status = status;
    }

    public void adicionarEquipamento(Equipamento equipamento) {
        equipamentos.add(equipamento);
        status = "Em andamento";
    }

    public void adicionarEquipamento(String nomeModelo) {

    }

    public void listarEquipamentos() {
        for (Equipamento equipamento : equipamentos)
            System.out.println(equipamento);
    }

    public double calcularOrcamento() {
        double total = 0.00;
        return total;
    }

    public void encerrar() {
        if (!equipamentos.isEmpty()) {
            System.out.println("Encerrando... Prossiga para o pagamento!");
        }
        else {
            System.out.println("Não é possível encerrar uma Ordem vazia! Cancele ou realize ao menos uma ordem de serviço.");
        }
    }

    public void encerrar(FormaPagamento pagamento) {

    }

    public void cancelar() {
        status = "Cancelado";
        System.out.println("Cancelando");
    }

}
