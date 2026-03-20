public class Main {
    public static void main(String[] args) {
        Pombo pombo = new Pombo(2);
        Camelo camelo = new Camelo(4);

        pombo.andar();
        pombo.voar();

        camelo.andar();
        camelo.tenhoCorcovas();
    }
}