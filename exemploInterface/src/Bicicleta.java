public class Bicicleta extends MeioTransporte{
    private String formatoGuidao;

    public Bicicleta(int rodas, String formatoGuidao) {
        super(rodas);
        this.formatoGuidao = formatoGuidao;
    }

    @Override
    public void mover() {
        System.out.println("Pedalando\nQuantidade de rodas: " + getRodas());
    }

    public void darGrau() {
        System.out.println("Formato do guidão: " + formatoGuidao);
    }
}
