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
            System.out.println("Item já foi emprestado!");
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

    public void devolverItem(String codigo, int diasAtraso) {
        buscarItemPorCodigo(codigo);

    }

    public Biblioteca(LinkedList<ItemBiblioteca> itens) {
        this.itens = itens;
    }

    public double getTotalMultasArrecadadas() {
        return totalMultasArrecadadas;
    }

    public void listarItens() {
        if (itens.isEmpty()) {
            System.out.println("Não há itens cadastrados!");
        }
        else{
            for (ItemBiblioteca item : itens) {
                System.out.printf("%s - %s - %s - %d%n",
                        getClass().getSimpleName(),
                        item.getCodigo(),
                        item.getTitulo(),
                        item.getAnoPublicacao()
                );
            }
        }
    }
}
