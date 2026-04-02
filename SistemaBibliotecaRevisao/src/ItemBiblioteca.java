public abstract class ItemBiblioteca {
    protected String titulo;
    protected Boolean disponivel;

    public ItemBiblioteca(String titulo, Boolean disponivel) {
        this.disponivel = disponivel;
        this.titulo = titulo;
    }

    public double calcularMulta (int dias) {
        return 0.00f;
    }

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


}
