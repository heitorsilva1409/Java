package domain.animal;

public class Gato extends Animal{
    boolean acostumadoAgua;

    public Gato(String nome, int idade, int tipoPelo, String nomeDono, boolean acostumadoAgua) {
        super(nome, idade, tipoPelo, nomeDono);
        this.acostumadoAgua = acostumadoAgua;
    }

    public boolean isAcostumadoAgua() {
        return acostumadoAgua;
    }


}
