import java.util.LinkedList;

public class Biblioteca {
    private LinkedList<ItemBiblioteca> itens;
    private double totalMultasArrecadadas;

    public Biblioteca() {
        itens = new LinkedList<>();
    }

    public void cadastrarItem(ItemBiblioteca item) {
        itens.add(item);
        ItemBiblioteca.setTotalItensCadastrados(ItemBiblioteca.getTotalItensCadastrados() + 1);
    }

    public void emprestarItem(ItemBiblioteca item) {
        if (item.isEmprestado()) {
            System.out.println("O item informado já está emprestado.");
        } else {
            System.out.println("Item emprestado com sucesso");
        }
    }

    public ItemBiblioteca buscarItemPorCodigo(String codigo) {
        for (ItemBiblioteca itemAtual : itens) {
            if (itemAtual.getCodigo().equalsIgnoreCase(codigo)) {
                return itemAtual;
            }
            else {
                System.out.println("Não foi encontrado um item para este código");
            }
        }
        //Em desenvolvimento
        return null;
    }

    public double devolverItem(String codigo, int diasAtraso) {
        ItemBiblioteca item = buscarItemPorCodigo(codigo); {
            if (item.getCodigo().equalsIgnoreCase(codigo)) {
                item.devolver();
                double multa = item.calcularMulta(diasAtraso);
                totalMultasArrecadadas += multa;
                return multa;
            }
            else {
                System.out.println("Item não encontrado");
            }
        }
        return 0.00;
    }

    public Biblioteca(LinkedList<ItemBiblioteca> itens) {
        this.itens = itens;
    }

    public double getTotalMultasArrecadadas() {
        return totalMultasArrecadadas;
    }

    public void listarItens() {
        if (itens.isEmpty()) {
            System.out.println("Não há nenhum item cadastrado!\n");
            return;
        }
        for (ItemBiblioteca itemBiblioteca : itens) {
            System.out.println(itemBiblioteca);
        }
    }
}
