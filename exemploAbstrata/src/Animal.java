public abstract class Animal {
    private int qtdPatas;

    public Animal(int qtdPatas) {
        this.qtdPatas = qtdPatas;
    }

    public void andar(){
        System.out.println("Andando com " + qtdPatas + " patas");
    }
}
