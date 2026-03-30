import java.util.LinkedList;
import java.util.List;

public class Catalogo <T> {
    private T item;
    private List <T> itens = new LinkedList<>();
    private int contador = 0;

    public Catalogo () {
    }

    public void adicionar(T item) {
        itens.add(item);
        System.out.println("Item adicionado com sucesso!");
    }

    public void remover(int num) {
        itens.remove(num);
        System.out.println("Item removido com sucesso!");
    }

    public void listarItens() {
        if (itens.isEmpty()) {
            System.out.println("Lista vazia");
        } else {
            for (T item : itens) {
                System.out.printf("Item %d: %s%n",contador, item);
                contador++;
            }
        }
    }
}