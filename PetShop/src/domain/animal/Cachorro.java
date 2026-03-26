package domain.animal;

public class Cachorro extends Animal{
    int porte;

    public Cachorro(String nome, int idade, int tipoPelo, String nomeDono, int porte) {
        super(nome, idade, tipoPelo, nomeDono);
        this.porte = porte;
    }

    public int getPorte() {
        return porte;
    }

    public double calcularAdicionalPorte(int porte) {
        double adicionalPorte = 0;
        switch (porte) {
            case 1:
                adicionalPorte = 1;
                break;
            case 2:
                adicionalPorte = 1.2;
                break;
            case 3:
                adicionalPorte = 1.4;
                break;
            case 4:
                adicionalPorte = 1.8;
                break;
        }
        return adicionalPorte;
    }

}
