public class Livro extends ItemBiblioteca implements Emprestavel {
    public Livro(String titulo, Boolean disponivel) {
        super(titulo, disponivel);
    }

    @Override
    public double calcularMulta(int dias) {
        return dias;
    }

    @Override
    public boolean devolver() {
        if(getDisponivel()) {
            System.out.println("Não é possível devolver um item que não está emprestado.");
        } else {
            System.out.println("Item devolvido com sucesso!");
            setDisponivel(true);
        }
        return false;
    }

    @Override
    public boolean emprestar() {
        if (getDisponivel()) {
            System.out.println("Item emprestado com sucesso. Atente-se ao tempo para devolução!");
            setDisponivel(false);
        } else {
            System.out.println("Item não está disponível para empréstimo, pois já está emprestado!");
        }
        return false;
    }

    @Override
    public String toString(){
        return String.format("Tipo: %s - Título: %s | Disponível: %s",
                getClass().getSimpleName(),
                getTitulo(),
                getDisponivel());
    }
}
