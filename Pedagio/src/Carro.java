public class Carro extends Veiculo{
    public Carro(String placaVeiculo, String modelo, int qtdEixos) {
        super(placaVeiculo, modelo, qtdEixos);
    }

    @Override
    public float calcularTarifa(){
        return 12.00f;
    }
}
