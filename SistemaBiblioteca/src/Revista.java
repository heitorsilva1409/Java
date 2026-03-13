public class Revista extends ItemBiblioteca{
    private int edicao;

    public Revista(String codigo, String titulo, int anoPublicacao, int edicao) {
        super(anoPublicacao, codigo, titulo);
        this.edicao = edicao;
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 0.75;

    }
}
