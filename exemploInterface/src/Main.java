public class Main {
    public static void main(String[] args) {
        Carro c = new Carro(4,2010);
        Bicicleta b = new Bicicleta(2,"em T");
        Aviao a = new Aviao(48,4);

        c.mover();
        c.portaMalas();

        b.mover();
        b.darGrau();

        a.mover();
        a.alcarVoo();
    }
}