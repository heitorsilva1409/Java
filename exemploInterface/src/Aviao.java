public class Aviao extends MeioTransporte{
    private int qtdAsas;

    public Aviao(int rodas, int qtdAsas) {
        super(rodas);
        this.qtdAsas = qtdAsas;
    }

    @Override
    public void mover() {
        System.out.println("Voando\nQuantidade de rodas: " + getRodas());
    }

    public void alcarVoo() {
        System.out.println("Alçando voo");
    }
}
