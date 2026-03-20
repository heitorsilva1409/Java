public class Carro extends MeioTransporte{
    private int pesoPortaMalas;

    public Carro(int rodas, int pesoPortaMalas) {
        super(rodas);
        this.pesoPortaMalas = pesoPortaMalas;
    }

    @Override
    public void mover() {
        System.out.println("Acelerando\nQuantidade rodas: " + getRodas());
    }

    public void portaMalas() {
        System.out.println("O tamanho do porta malas(em kgs) é: " + pesoPortaMalas);
    }
}
