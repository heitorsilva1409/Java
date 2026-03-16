public class ItemBiblioteca {
    private String codigo;
    private String titulo;
    private int anoPublicacao;
    private boolean emprestado;
    private static int totalItensCadastrados = 0;

    public ItemBiblioteca(int anoPublicacao, String codigo, String titulo) {
        this.anoPublicacao = anoPublicacao;
        this.codigo = codigo;
        this.titulo = titulo;
        this.emprestado = false;
    }

    public void emprestar(){
        emprestado = true;
    }

    public void devolver() {
        emprestado = false;
    }

    public static int getTotalItensCadastrados() {
        return totalItensCadastrados;
    }

    public static void setTotalItensCadastrados(int totalItensCadastrados) {
        ItemBiblioteca.totalItensCadastrados = totalItensCadastrados;
    }

    public boolean isEmprestado() {
        if (emprestado) {
            return true;
        } else {
            return false;
        }
    }

    public double calcularMulta(int diasAtraso) {
        return 0.00;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    @Override
    public String toString(){
        return String.format("%s - %s - %s - %d - %s%n",
                getClass().getSimpleName(),
                getCodigo(),
                getTitulo(),
                getAnoPublicacao(),
                emprestado
                );
    }
}
