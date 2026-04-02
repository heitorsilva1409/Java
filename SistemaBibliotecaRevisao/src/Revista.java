public class Revista extends ItemBiblioteca {
    public Revista(String titulo, Boolean disponivel) {
        super(titulo, disponivel);
    }

    @Override
    public double calcularMulta(int dias) {
        return dias * 0.5f;
    }

    @Override
    public String toString(){
        return String.format("Tipo: %s - Título: %s | Disponível: %s",
                getClass().getSimpleName(),
                getTitulo(),
                getDisponivel());
    }
}
