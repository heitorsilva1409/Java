public abstract class MeioTransporte implements Mover {
    private int rodas;

    public MeioTransporte(int rodas) {
        this.rodas = rodas;
    }

    @Override
    public void mover() {
    }

    public int getRodas() {
        return rodas;
    }
}
