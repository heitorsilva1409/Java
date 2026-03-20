public class Camelo extends Animal {
    private int qtdCorcovas = 2;

    public Camelo(int qtdPatas) {
        super(qtdPatas);
    }

    public void tenhoCorcovas(){
        System.out.println("Um camelo tem " + qtdCorcovas + " corcovas");
    }
}
