public class Livro extends ItemBiblioteca{
    private String autor;

    public Livro(String codigo, String titulo, int anoPublicacao, String autor) {
        super(anoPublicacao, codigo, titulo);
        this.autor = autor;
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 1.5;
    }
}