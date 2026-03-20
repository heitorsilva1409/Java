public class Pombo extends Animal {
    private int qtdAsas = 2;

    public Pombo(int qtdPatas) {
        super(qtdPatas);
    }

    public void voar() {
        System.out.println("Voando com minhas " + qtdAsas + " asas");
    }
}