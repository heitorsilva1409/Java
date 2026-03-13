public class DVD extends ItemBiblioteca{
    private int duracaoMinutos;

    public DVD(String codigo, String titulo, int anoPublicacao, int duracaoMinutos) {
        super(anoPublicacao, codigo, titulo);
        this.duracaoMinutos = duracaoMinutos;
    }

    @Override
    public double calcularMulta(int diasAtraso) {
        return diasAtraso * 3;
    }
}
