package domain.animal;

public abstract class Animal {
    String nome;
    int idade;
    int tipoPelo;
    String nomeDono;

    public Animal(String nome, int idade, int tipoPelo, String nomeDono) {
        this.idade = idade;
        this.nome = nome;
        this.nomeDono = nomeDono;
        this.tipoPelo = tipoPelo;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeDono() {
        return nomeDono;
    }

    public int getTipoPelo() {
        return tipoPelo;
    }

    public double calcularPrecoPorTipoPelo(int tipoPelo) {

        int precoPorPelo = 0;

        switch (tipoPelo){
            case 0:
                precoPorPelo = 10;
                break;
            case 1:
                precoPorPelo = 30;
                break;
            case 2:
                precoPorPelo = 40;
                break;
            case 3:
                precoPorPelo = 60;
                break;
        }
        return precoPorPelo;
    }

    @Override
    public String toString(){
        return String.format("Tipo: %s - Nome: %s - Idade: %d",
                getClass().getSimpleName(),
                nome,
                idade);
    }

}
